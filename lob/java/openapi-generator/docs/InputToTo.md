

# InputToTo

Must either be an address ID or an inline object with correct address parameters. If an object is used, an address will be created, corrected, and standardized for free whenever possible using our US Address Verification engine (if it is a US address), and returned back with an ID. Depending on your <a href=\"https://dashboard.lob.com/#/settings/editions\" target=\"_blank\">Print & Mail Edition</a>, US addresses may also be run through <a href=\"#tag/National-Change-of-Address\">National Change of Address Linkage(NCOALink)</a>. Non-US addresses will be standardized into uppercase only. If a US address used does not meet your account’s <a href=\"https://dashboard.lob.com/#/settings/account\" target=\"_blank\">US Mail strictness setting</a>, the request will fail. <a href=\"https://help.lob.com/print-and-mail/all-about-addresses\" target=\"_blank\">Lob Guide: Verification of Mailing Addresses</a>

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addressLine1** | **String** | The primary number, street name, and directional information. |  |
|**addressLine2** | **String** | An optional field containing any information which can&#39;t fit into line 1. |  [optional] |
|**addressCity** | **String** |  |  |
|**addressState** | **String** |  |  |
|**addressZip** | **String** | Optional postal code. |  |



