package com.vk.api.sdk.queries.users;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.users.responses.GetFollowersResponse;
import com.vk.api.sdk.queries.Field;

import java.util.Collections;
import java.util.List;

/**
 * Query for Users.getFollowers method
 */
public class UsersGetFollowersQuery extends AbstractQueryBuilder<UsersGetFollowersQuery, GetFollowersResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public UsersGetFollowersQuery(VkApiClient client, Actor actor) {
        super(client, "users.getFollowers", GetFollowersResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     */
    public UsersGetFollowersQuery(VkApiClient client) {
        super(client, "users.getFollowers", GetFollowersResponse.class);
    }

    /**
     * User ID.
     *
     * @param value value of "user id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UsersGetFollowersQuery userId(Integer value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Offset needed to return a specific subset of followers.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UsersGetFollowersQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of followers to return.
     *
     * @param value value of "count" parameter. Maximum is 1000. Minimum is 0. By default 100.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UsersGetFollowersQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Profile fields to return. Sample values: ''nickname'', ''screen_name'', ''sex'', ''bdate'' (birthdate), ''city'', ''country'', ''timezone'', ''photo'', ''photo_medium'', ''photo_big'', ''has_mobile'', ''rate'', ''contacts'', ''education'', ''online''.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UsersGetFollowersQuery fields(Field... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Case for declension of user name and surname:
     * ''nom'' - nominative (default)
     * ''gen'' - genitive
     * ''dat'' - dative
     * ''acc'' - accusative
     * ''ins'' - instrumental
     * ''abl'' - prepositional
     *
     * @param value value of "name case" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UsersGetFollowersQuery nameCase(String value) {
        return unsafeParam("name_case", value);
    }

    @Override
    protected UsersGetFollowersQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Collections.EMPTY_LIST;
    }
}