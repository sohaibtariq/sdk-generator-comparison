

# LetterDetailsWritable

Properties that the letters in your Creative should have. Check within in order to add a QR code to your creative.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addressPlacement** | **AddressPlacement** |  |  [optional] |
|**addOnTypes** | **List&lt;LetterAddOnTypes&gt;** | An array containing the types of add-ons for the Letter Creative. |  [optional] |
|**buckslips** | **List&lt;String&gt;** | A single-element array containing an existing buckslip id in a string format. See [buckslips](#tag/Buckslips) for more information. Note that buckslip letter campaigns require a minimum send quantity of 5,000 letters per campaign. |  [optional] |
|**cards** | **List&lt;String&gt;** | A single-element array containing an existing card id in a string format. See [cards](#tag/Cards) for more information. |  [optional] |
|**color** | **Boolean** | Set this key to &#x60;true&#x60; if you would like to print in color. Set to &#x60;false&#x60; if you would like to print in black and white. |  |
|**customEnvelope** | **String** | Accepts an envelope ID for any customized envelope with available inventory. If no inventory is available for the specified ID, the letter will not be sent, and an error will be returned. If the letter has more than 6 sheets, it will be sent in a blank flat envelope. Custom envelopes may be created and ordered from the dashboard. This feature is exclusive to certain customers. Upgrade to the appropriate &lt;a href&#x3D;\&quot;https://dashboard.lob.com/#/settings/editions\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Print &amp; Mail Edition&lt;/a&gt; to gain access. |  [optional] |
|**doubleSided** | **Boolean** | Set this attribute to &#x60;true&#x60; for double sided printing, or &#x60;false&#x60; for for single sided printing. Defaults to &#x60;true&#x60;. |  [optional] |
|**extraService** | **ExtraService** |  |  [optional] |
|**mailType** | **MailType** |  |  [optional] |
|**qrCode** | [**QrCodeCampaigns**](QrCodeCampaigns.md) |  |  [optional] |



