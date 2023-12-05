# Campaigns
(*campaigns*)

## Overview

The campaigns endpoint allows you to create and view campaigns that can be used to send multiple letters or postcards.
The API provides endpoints for creating campaigns, updating campaigns, retrieving individual campaigns, listing campaigns, and deleting
campaigns.


### Available Operations

* [campaignsList](#campaignslist) - List
* [campaignCreate](#campaigncreate) - Create
* [campaignDelete](#campaigndelete) - Delete
* [campaignRetrieve](#campaignretrieve) - Retrieve
* [campaignUpdate](#campaignupdate) - Update
* [campaignSend](#campaignsend) - Send Campaign

## campaignsList

Returns a list of your campaigns. The campaigns are returned sorted by creation date, with the most recently created campaigns appearing first.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.CampaignsListRequest;
import org.openapis.openapi.models.operations.CampaignsListResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string", "string"){{
                    username = "";
                    password = "";
                }})
                .build();

            CampaignsListResponse res = sdk.campaigns.campaignsList(10L, new String[]{{
                add("string"),
            }}, "string");

            if (res.object != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 | Example                                                                                     |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `limit`                                                                                     | *Long*                                                                                      | :heavy_minus_sign:                                                                          | How many results to return.                                                                 | 10                                                                                          |
| `include`                                                                                   | List<*String*>                                                                              | :heavy_minus_sign:                                                                          | Request that the response include the total count by specifying `include=["total_count"]`.<br/> |                                                                                             |
| `beforeAfter`                                                                               | *Object*                                                                                    | :heavy_minus_sign:                                                                          | `before` and `after` are both optional but only one of them can be in the query at a time.<br/> |                                                                                             |


### Response

**[org.openapis.openapi.models.operations.CampaignsListResponse](../../models/operations/CampaignsListResponse.md)**


## campaignCreate

Creates a new campaign with the provided properties. See how to launch your first campaign [here](https://help.lob.com/print-and-mail/building-a-mail-strategy/campaign-or-triggered-sends/launch-your-first-campaign).

### Example Usage

```java
package hello.world;

import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.CampaignCreateRequest;
import org.openapis.openapi.models.operations.CampaignCreateResponse;
import org.openapis.openapi.models.shared.CampaignWritable;
import org.openapis.openapi.models.shared.CmpScheduleType;
import org.openapis.openapi.models.shared.CmpUseType;
import org.openapis.openapi.models.shared.LangSpec;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string", "string"){{
                    username = "";
                    password = "";
                }})
                .build();

            CampaignCreateResponse res = sdk.campaigns.campaignCreate(new CampaignWritable("string", CmpScheduleType.IMMEDIATE, CmpUseType.MARKETING){{
                name = "string";
                scheduleType = CmpScheduleType.IMMEDIATE;
                metadata = new java.util.HashMap<String, String>(){{
                    put("key", "string");
                }};
                useType = CmpUseType.LESS_THAN_NIL_GREATER_THAN;
            }}, LangSpec.NATIVE_);

            if (res.campaign != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                            | Type                                                                                                                                                                                 | Required                                                                                                                                                                             | Description                                                                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `campaignWritable`                                                                                                                                                                   | [org.openapis.openapi.models.shared.CampaignWritable](../../models/shared/CampaignWritable.md)                                                                                       | :heavy_check_mark:                                                                                                                                                                   | N/A                                                                                                                                                                                  |
| `xLangOutput`                                                                                                                                                                        | [org.openapis.openapi.models.shared.LangSpec](../../models/shared/LangSpec.md)                                                                                                       | :heavy_minus_sign:                                                                                                                                                                   | * `native` - Translate response to the native language of the country in the request<br/>* `match` - match the response to the language in the request<br/><br/>Default response is in English.<br/> |


### Response

**[org.openapis.openapi.models.operations.CampaignCreateResponse](../../models/operations/CampaignCreateResponse.md)**


## campaignDelete

Delete an existing campaign. You need only supply the unique identifier that was returned upon campaign creation. Deleting a campaign also deletes any associated mail pieces that have been created but not sent. A campaign's `send_date` matches its associated mail pieces' `send_date`s.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.CampaignDeleteRequest;
import org.openapis.openapi.models.operations.CampaignDeleteResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string", "string"){{
                    username = "";
                    password = "";
                }})
                .build();

            CampaignDeleteResponse res = sdk.campaigns.campaignDelete("string");

            if (res.object != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `cmpId`            | *String*           | :heavy_check_mark: | id of the campaign |


### Response

**[org.openapis.openapi.models.operations.CampaignDeleteResponse](../../models/operations/CampaignDeleteResponse.md)**


## campaignRetrieve

Retrieves the details of an existing campaign. You need only supply the unique campaign identifier that was returned upon campaign creation.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.CampaignRetrieveRequest;
import org.openapis.openapi.models.operations.CampaignRetrieveResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string", "string"){{
                    username = "";
                    password = "";
                }})
                .build();

            CampaignRetrieveResponse res = sdk.campaigns.campaignRetrieve("string");

            if (res.campaign != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `cmpId`            | *String*           | :heavy_check_mark: | id of the campaign |


### Response

**[org.openapis.openapi.models.operations.CampaignRetrieveResponse](../../models/operations/CampaignRetrieveResponse.md)**


## campaignUpdate

Update the details of an existing campaign. You need only supply the unique identifier that was returned upon campaign creation.

### Example Usage

```java
package hello.world;

import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.CampaignUpdateRequest;
import org.openapis.openapi.models.operations.CampaignUpdateResponse;
import org.openapis.openapi.models.shared.CampaignUpdatable;
import org.openapis.openapi.models.shared.CmpScheduleType;
import org.openapis.openapi.models.shared.CmpUseType;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string", "string"){{
                    username = "";
                    password = "";
                }})
                .build();

            CampaignUpdateResponse res = sdk.campaigns.campaignUpdate("string", new CampaignUpdatable(){{
                metadata = new java.util.HashMap<String, String>(){{
                    put("key", "string");
                }};
            }});

            if (res.campaign != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                        | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `cmpId`                                                                                          | *String*                                                                                         | :heavy_check_mark:                                                                               | id of the campaign                                                                               |
| `campaignUpdatable`                                                                              | [org.openapis.openapi.models.shared.CampaignUpdatable](../../models/shared/CampaignUpdatable.md) | :heavy_check_mark:                                                                               | N/A                                                                                              |


### Response

**[org.openapis.openapi.models.operations.CampaignUpdateResponse](../../models/operations/CampaignUpdateResponse.md)**


## campaignSend

Sends a campaign. You need only supply the unique campaign identifier that was returned upon campaign creation.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.CampaignSendRequest;
import org.openapis.openapi.models.operations.CampaignSendResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string", "string"){{
                    username = "";
                    password = "";
                }})
                .build();

            CampaignSendResponse res = sdk.campaigns.campaignSend("string");

            if (res.campaign != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `cmpId`            | *String*           | :heavy_check_mark: | id of the campaign |


### Response

**[org.openapis.openapi.models.operations.CampaignSendResponse](../../models/operations/CampaignSendResponse.md)**

