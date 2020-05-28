/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.session.qldb.model.transform;

import com.amazonaws.services.session.qldb.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CommitTransactionResult
 */
class CommitTransactionResultJsonMarshaller {

    public void marshall(CommitTransactionResult commitTransactionResult, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (commitTransactionResult.getTransactionId() != null) {
            String transactionId = commitTransactionResult.getTransactionId();
            jsonWriter.name("TransactionId");
            jsonWriter.value(transactionId);
        }
        if (commitTransactionResult.getCommitDigest() != null) {
            java.nio.ByteBuffer commitDigest = commitTransactionResult.getCommitDigest();
            jsonWriter.name("CommitDigest");
            jsonWriter.value(commitDigest);
        }
        jsonWriter.endObject();
    }

    private static CommitTransactionResultJsonMarshaller instance;

    public static CommitTransactionResultJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CommitTransactionResultJsonMarshaller();
        return instance;
    }
}
