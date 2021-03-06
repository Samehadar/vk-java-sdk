package com.vk.api.sdk.queries.notifications;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.notifications.responses.GetResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Notifications.get method
 */
public class NotificationsGetQuery extends AbstractQueryBuilder<NotificationsGetQuery, GetResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public NotificationsGetQuery(VkApiClient client, Actor actor) {
        super(client, "notifications.get", GetResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Number of notifications to return.
     *
     * @param value value of "count" parameter. Maximum is 100. Minimum is 0. By default 30.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NotificationsGetQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Set start from
     *
     * @param value value of "start from" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NotificationsGetQuery startFrom(String value) {
        return unsafeParam("start_from", value);
    }

    /**
     * Type of notifications to return
     *
     * @param value value of "filters" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NotificationsGetQuery filters(NotificationsGetFilter... value) {
        return unsafeParam("filters", value);
    }

    /**
     * Type of notifications to return
     *
     * @param value value of "filters" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NotificationsGetQuery filters(List<NotificationsGetFilter> value) {
        return unsafeParam("filters", value);
    }

    /**
     * Earliest timestamp (in Unix time) of a notification to return. By default, 24 hours ago.
     *
     * @param value value of "start time" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NotificationsGetQuery startTime(Integer value) {
        return unsafeParam("start_time", value);
    }

    /**
     * Latest timestamp (in Unix time) of a notification to return. By default, the current time.
     *
     * @param value value of "end time" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NotificationsGetQuery endTime(Integer value) {
        return unsafeParam("end_time", value);
    }

    @Override
    protected NotificationsGetQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
