

# QrCodeCampaignsRedirectUrl

Redirect all mail recipients to either a single URL or a custom personalized URL for each recipient.  To redirect to a single URL for the whole campaign, add a `redirect_url` in the request body along with the url as string. To redirect to a custom URL for each recipient, do not provide any value for `redirect_url`. Instead, create an extra column in the [audience file](https://help.lob.com/print-and-mail/building-a-mail-strategy/campaign-or-triggered-sends/campaign-audience-guide) with a unique link against each address row and while creating an upload, map `qr_code_redirect_url` to this column. If the QR code section is used but a redirection url is not provided or mapped while creating an upload, then there might be failures in creating individual mail pieces. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|



