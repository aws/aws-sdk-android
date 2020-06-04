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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

public class GetMaintenanceWindowResult implements Serializable {
    /**
     * <p>
     * The ID of the created maintenance window.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     */
    private String windowId;

    /**
     * <p>
     * The name of the maintenance window.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     */
    private String name;

    /**
     * <p>
     * The description of the maintenance window.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String description;

    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, for when the maintenance
     * window is scheduled to become active. The maintenance window will not run
     * before this specified time.
     * </p>
     */
    private String startDate;

    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, for when the maintenance
     * window is scheduled to become inactive. The maintenance window will not
     * run after this specified time.
     * </p>
     */
    private String endDate;

    /**
     * <p>
     * The schedule of the maintenance window in the form of a cron or rate
     * expression.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String schedule;

    /**
     * <p>
     * The time zone that the scheduled maintenance window executions are based
     * on, in Internet Assigned Numbers Authority (IANA) format. For example:
     * "America/Los_Angeles", "etc/UTC", or "Asia/Seoul". For more information,
     * see the <a href="https://www.iana.org/time-zones">Time Zone Database</a>
     * on the IANA website.
     * </p>
     */
    private String scheduleTimezone;

    /**
     * <p>
     * The next time the maintenance window will actually run, taking into
     * account any specified times for the maintenance window to become active
     * or inactive.
     * </p>
     */
    private String nextExecutionTime;

    /**
     * <p>
     * The duration of the maintenance window in hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 24<br/>
     */
    private Integer duration;

    /**
     * <p>
     * The number of hours before the end of the maintenance window that Systems
     * Manager stops scheduling new tasks for execution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     */
    private Integer cutoff;

    /**
     * <p>
     * Whether targets must be registered with the maintenance window before
     * tasks can be defined for those targets.
     * </p>
     */
    private Boolean allowUnassociatedTargets;

    /**
     * <p>
     * Indicates whether the maintenance window is enabled.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The date the maintenance window was created.
     * </p>
     */
    private java.util.Date createdDate;

    /**
     * <p>
     * The date the maintenance window was last modified.
     * </p>
     */
    private java.util.Date modifiedDate;

    /**
     * <p>
     * The ID of the created maintenance window.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     *
     * @return <p>
     *         The ID of the created maintenance window.
     *         </p>
     */
    public String getWindowId() {
        return windowId;
    }

    /**
     * <p>
     * The ID of the created maintenance window.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     *
     * @param windowId <p>
     *            The ID of the created maintenance window.
     *            </p>
     */
    public void setWindowId(String windowId) {
        this.windowId = windowId;
    }

    /**
     * <p>
     * The ID of the created maintenance window.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     *
     * @param windowId <p>
     *            The ID of the created maintenance window.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMaintenanceWindowResult withWindowId(String windowId) {
        this.windowId = windowId;
        return this;
    }

    /**
     * <p>
     * The name of the maintenance window.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @return <p>
     *         The name of the maintenance window.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the maintenance window.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param name <p>
     *            The name of the maintenance window.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the maintenance window.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param name <p>
     *            The name of the maintenance window.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMaintenanceWindowResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The description of the maintenance window.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         The description of the maintenance window.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the maintenance window.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param description <p>
     *            The description of the maintenance window.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the maintenance window.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param description <p>
     *            The description of the maintenance window.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMaintenanceWindowResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, for when the maintenance
     * window is scheduled to become active. The maintenance window will not run
     * before this specified time.
     * </p>
     *
     * @return <p>
     *         The date and time, in ISO-8601 Extended format, for when the
     *         maintenance window is scheduled to become active. The maintenance
     *         window will not run before this specified time.
     *         </p>
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, for when the maintenance
     * window is scheduled to become active. The maintenance window will not run
     * before this specified time.
     * </p>
     *
     * @param startDate <p>
     *            The date and time, in ISO-8601 Extended format, for when the
     *            maintenance window is scheduled to become active. The
     *            maintenance window will not run before this specified time.
     *            </p>
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, for when the maintenance
     * window is scheduled to become active. The maintenance window will not run
     * before this specified time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startDate <p>
     *            The date and time, in ISO-8601 Extended format, for when the
     *            maintenance window is scheduled to become active. The
     *            maintenance window will not run before this specified time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMaintenanceWindowResult withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, for when the maintenance
     * window is scheduled to become inactive. The maintenance window will not
     * run after this specified time.
     * </p>
     *
     * @return <p>
     *         The date and time, in ISO-8601 Extended format, for when the
     *         maintenance window is scheduled to become inactive. The
     *         maintenance window will not run after this specified time.
     *         </p>
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, for when the maintenance
     * window is scheduled to become inactive. The maintenance window will not
     * run after this specified time.
     * </p>
     *
     * @param endDate <p>
     *            The date and time, in ISO-8601 Extended format, for when the
     *            maintenance window is scheduled to become inactive. The
     *            maintenance window will not run after this specified time.
     *            </p>
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, for when the maintenance
     * window is scheduled to become inactive. The maintenance window will not
     * run after this specified time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endDate <p>
     *            The date and time, in ISO-8601 Extended format, for when the
     *            maintenance window is scheduled to become inactive. The
     *            maintenance window will not run after this specified time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMaintenanceWindowResult withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * <p>
     * The schedule of the maintenance window in the form of a cron or rate
     * expression.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The schedule of the maintenance window in the form of a cron or
     *         rate expression.
     *         </p>
     */
    public String getSchedule() {
        return schedule;
    }

    /**
     * <p>
     * The schedule of the maintenance window in the form of a cron or rate
     * expression.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param schedule <p>
     *            The schedule of the maintenance window in the form of a cron
     *            or rate expression.
     *            </p>
     */
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * The schedule of the maintenance window in the form of a cron or rate
     * expression.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param schedule <p>
     *            The schedule of the maintenance window in the form of a cron
     *            or rate expression.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMaintenanceWindowResult withSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * <p>
     * The time zone that the scheduled maintenance window executions are based
     * on, in Internet Assigned Numbers Authority (IANA) format. For example:
     * "America/Los_Angeles", "etc/UTC", or "Asia/Seoul". For more information,
     * see the <a href="https://www.iana.org/time-zones">Time Zone Database</a>
     * on the IANA website.
     * </p>
     *
     * @return <p>
     *         The time zone that the scheduled maintenance window executions
     *         are based on, in Internet Assigned Numbers Authority (IANA)
     *         format. For example: "America/Los_Angeles", "etc/UTC", or
     *         "Asia/Seoul". For more information, see the <a
     *         href="https://www.iana.org/time-zones">Time Zone Database</a> on
     *         the IANA website.
     *         </p>
     */
    public String getScheduleTimezone() {
        return scheduleTimezone;
    }

    /**
     * <p>
     * The time zone that the scheduled maintenance window executions are based
     * on, in Internet Assigned Numbers Authority (IANA) format. For example:
     * "America/Los_Angeles", "etc/UTC", or "Asia/Seoul". For more information,
     * see the <a href="https://www.iana.org/time-zones">Time Zone Database</a>
     * on the IANA website.
     * </p>
     *
     * @param scheduleTimezone <p>
     *            The time zone that the scheduled maintenance window executions
     *            are based on, in Internet Assigned Numbers Authority (IANA)
     *            format. For example: "America/Los_Angeles", "etc/UTC", or
     *            "Asia/Seoul". For more information, see the <a
     *            href="https://www.iana.org/time-zones">Time Zone Database</a>
     *            on the IANA website.
     *            </p>
     */
    public void setScheduleTimezone(String scheduleTimezone) {
        this.scheduleTimezone = scheduleTimezone;
    }

    /**
     * <p>
     * The time zone that the scheduled maintenance window executions are based
     * on, in Internet Assigned Numbers Authority (IANA) format. For example:
     * "America/Los_Angeles", "etc/UTC", or "Asia/Seoul". For more information,
     * see the <a href="https://www.iana.org/time-zones">Time Zone Database</a>
     * on the IANA website.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduleTimezone <p>
     *            The time zone that the scheduled maintenance window executions
     *            are based on, in Internet Assigned Numbers Authority (IANA)
     *            format. For example: "America/Los_Angeles", "etc/UTC", or
     *            "Asia/Seoul". For more information, see the <a
     *            href="https://www.iana.org/time-zones">Time Zone Database</a>
     *            on the IANA website.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMaintenanceWindowResult withScheduleTimezone(String scheduleTimezone) {
        this.scheduleTimezone = scheduleTimezone;
        return this;
    }

    /**
     * <p>
     * The next time the maintenance window will actually run, taking into
     * account any specified times for the maintenance window to become active
     * or inactive.
     * </p>
     *
     * @return <p>
     *         The next time the maintenance window will actually run, taking
     *         into account any specified times for the maintenance window to
     *         become active or inactive.
     *         </p>
     */
    public String getNextExecutionTime() {
        return nextExecutionTime;
    }

    /**
     * <p>
     * The next time the maintenance window will actually run, taking into
     * account any specified times for the maintenance window to become active
     * or inactive.
     * </p>
     *
     * @param nextExecutionTime <p>
     *            The next time the maintenance window will actually run, taking
     *            into account any specified times for the maintenance window to
     *            become active or inactive.
     *            </p>
     */
    public void setNextExecutionTime(String nextExecutionTime) {
        this.nextExecutionTime = nextExecutionTime;
    }

    /**
     * <p>
     * The next time the maintenance window will actually run, taking into
     * account any specified times for the maintenance window to become active
     * or inactive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextExecutionTime <p>
     *            The next time the maintenance window will actually run, taking
     *            into account any specified times for the maintenance window to
     *            become active or inactive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMaintenanceWindowResult withNextExecutionTime(String nextExecutionTime) {
        this.nextExecutionTime = nextExecutionTime;
        return this;
    }

    /**
     * <p>
     * The duration of the maintenance window in hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 24<br/>
     *
     * @return <p>
     *         The duration of the maintenance window in hours.
     *         </p>
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * <p>
     * The duration of the maintenance window in hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 24<br/>
     *
     * @param duration <p>
     *            The duration of the maintenance window in hours.
     *            </p>
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The duration of the maintenance window in hours.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 24<br/>
     *
     * @param duration <p>
     *            The duration of the maintenance window in hours.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMaintenanceWindowResult withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * <p>
     * The number of hours before the end of the maintenance window that Systems
     * Manager stops scheduling new tasks for execution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     *
     * @return <p>
     *         The number of hours before the end of the maintenance window that
     *         Systems Manager stops scheduling new tasks for execution.
     *         </p>
     */
    public Integer getCutoff() {
        return cutoff;
    }

    /**
     * <p>
     * The number of hours before the end of the maintenance window that Systems
     * Manager stops scheduling new tasks for execution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     *
     * @param cutoff <p>
     *            The number of hours before the end of the maintenance window
     *            that Systems Manager stops scheduling new tasks for execution.
     *            </p>
     */
    public void setCutoff(Integer cutoff) {
        this.cutoff = cutoff;
    }

    /**
     * <p>
     * The number of hours before the end of the maintenance window that Systems
     * Manager stops scheduling new tasks for execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     *
     * @param cutoff <p>
     *            The number of hours before the end of the maintenance window
     *            that Systems Manager stops scheduling new tasks for execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMaintenanceWindowResult withCutoff(Integer cutoff) {
        this.cutoff = cutoff;
        return this;
    }

    /**
     * <p>
     * Whether targets must be registered with the maintenance window before
     * tasks can be defined for those targets.
     * </p>
     *
     * @return <p>
     *         Whether targets must be registered with the maintenance window
     *         before tasks can be defined for those targets.
     *         </p>
     */
    public Boolean isAllowUnassociatedTargets() {
        return allowUnassociatedTargets;
    }

    /**
     * <p>
     * Whether targets must be registered with the maintenance window before
     * tasks can be defined for those targets.
     * </p>
     *
     * @return <p>
     *         Whether targets must be registered with the maintenance window
     *         before tasks can be defined for those targets.
     *         </p>
     */
    public Boolean getAllowUnassociatedTargets() {
        return allowUnassociatedTargets;
    }

    /**
     * <p>
     * Whether targets must be registered with the maintenance window before
     * tasks can be defined for those targets.
     * </p>
     *
     * @param allowUnassociatedTargets <p>
     *            Whether targets must be registered with the maintenance window
     *            before tasks can be defined for those targets.
     *            </p>
     */
    public void setAllowUnassociatedTargets(Boolean allowUnassociatedTargets) {
        this.allowUnassociatedTargets = allowUnassociatedTargets;
    }

    /**
     * <p>
     * Whether targets must be registered with the maintenance window before
     * tasks can be defined for those targets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowUnassociatedTargets <p>
     *            Whether targets must be registered with the maintenance window
     *            before tasks can be defined for those targets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMaintenanceWindowResult withAllowUnassociatedTargets(Boolean allowUnassociatedTargets) {
        this.allowUnassociatedTargets = allowUnassociatedTargets;
        return this;
    }

    /**
     * <p>
     * Indicates whether the maintenance window is enabled.
     * </p>
     *
     * @return <p>
     *         Indicates whether the maintenance window is enabled.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Indicates whether the maintenance window is enabled.
     * </p>
     *
     * @return <p>
     *         Indicates whether the maintenance window is enabled.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Indicates whether the maintenance window is enabled.
     * </p>
     *
     * @param enabled <p>
     *            Indicates whether the maintenance window is enabled.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates whether the maintenance window is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            Indicates whether the maintenance window is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMaintenanceWindowResult withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * <p>
     * The date the maintenance window was created.
     * </p>
     *
     * @return <p>
     *         The date the maintenance window was created.
     *         </p>
     */
    public java.util.Date getCreatedDate() {
        return createdDate;
    }

    /**
     * <p>
     * The date the maintenance window was created.
     * </p>
     *
     * @param createdDate <p>
     *            The date the maintenance window was created.
     *            </p>
     */
    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date the maintenance window was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdDate <p>
     *            The date the maintenance window was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMaintenanceWindowResult withCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * <p>
     * The date the maintenance window was last modified.
     * </p>
     *
     * @return <p>
     *         The date the maintenance window was last modified.
     *         </p>
     */
    public java.util.Date getModifiedDate() {
        return modifiedDate;
    }

    /**
     * <p>
     * The date the maintenance window was last modified.
     * </p>
     *
     * @param modifiedDate <p>
     *            The date the maintenance window was last modified.
     *            </p>
     */
    public void setModifiedDate(java.util.Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    /**
     * <p>
     * The date the maintenance window was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param modifiedDate <p>
     *            The date the maintenance window was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMaintenanceWindowResult withModifiedDate(java.util.Date modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getWindowId() != null)
            sb.append("WindowId: " + getWindowId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getStartDate() != null)
            sb.append("StartDate: " + getStartDate() + ",");
        if (getEndDate() != null)
            sb.append("EndDate: " + getEndDate() + ",");
        if (getSchedule() != null)
            sb.append("Schedule: " + getSchedule() + ",");
        if (getScheduleTimezone() != null)
            sb.append("ScheduleTimezone: " + getScheduleTimezone() + ",");
        if (getNextExecutionTime() != null)
            sb.append("NextExecutionTime: " + getNextExecutionTime() + ",");
        if (getDuration() != null)
            sb.append("Duration: " + getDuration() + ",");
        if (getCutoff() != null)
            sb.append("Cutoff: " + getCutoff() + ",");
        if (getAllowUnassociatedTargets() != null)
            sb.append("AllowUnassociatedTargets: " + getAllowUnassociatedTargets() + ",");
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled() + ",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: " + getCreatedDate() + ",");
        if (getModifiedDate() != null)
            sb.append("ModifiedDate: " + getModifiedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWindowId() == null) ? 0 : getWindowId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode
                + ((getScheduleTimezone() == null) ? 0 : getScheduleTimezone().hashCode());
        hashCode = prime * hashCode
                + ((getNextExecutionTime() == null) ? 0 : getNextExecutionTime().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getCutoff() == null) ? 0 : getCutoff().hashCode());
        hashCode = prime
                * hashCode
                + ((getAllowUnassociatedTargets() == null) ? 0 : getAllowUnassociatedTargets()
                        .hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode
                + ((getModifiedDate() == null) ? 0 : getModifiedDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMaintenanceWindowResult == false)
            return false;
        GetMaintenanceWindowResult other = (GetMaintenanceWindowResult) obj;

        if (other.getWindowId() == null ^ this.getWindowId() == null)
            return false;
        if (other.getWindowId() != null && other.getWindowId().equals(this.getWindowId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null
                && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getEndDate() == null ^ this.getEndDate() == null)
            return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getScheduleTimezone() == null ^ this.getScheduleTimezone() == null)
            return false;
        if (other.getScheduleTimezone() != null
                && other.getScheduleTimezone().equals(this.getScheduleTimezone()) == false)
            return false;
        if (other.getNextExecutionTime() == null ^ this.getNextExecutionTime() == null)
            return false;
        if (other.getNextExecutionTime() != null
                && other.getNextExecutionTime().equals(this.getNextExecutionTime()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getCutoff() == null ^ this.getCutoff() == null)
            return false;
        if (other.getCutoff() != null && other.getCutoff().equals(this.getCutoff()) == false)
            return false;
        if (other.getAllowUnassociatedTargets() == null
                ^ this.getAllowUnassociatedTargets() == null)
            return false;
        if (other.getAllowUnassociatedTargets() != null
                && other.getAllowUnassociatedTargets().equals(this.getAllowUnassociatedTargets()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null
                && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getModifiedDate() == null ^ this.getModifiedDate() == null)
            return false;
        if (other.getModifiedDate() != null
                && other.getModifiedDate().equals(this.getModifiedDate()) == false)
            return false;
        return true;
    }
}