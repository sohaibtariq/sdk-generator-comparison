

# ErrorError


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**message** | **String** | A human-readable message with more details about the error |  |
|**statusCode** | **FailureStatusCode** |  |  |
|**code** | [**CodeEnum**](#CodeEnum) | A pre-defined string identifying an error. Error codes fall into three categories:  **GENERIC** * &#x60;bad_request&#x60; - 422: an invalid request was made. See error message for details. * &#x60;conflict&#x60; - 409/422: this operation would leave data in a conflicted state. * &#x60;feature_limit_reached&#x60; - 403: the account has reached its resource limit and requires upgrading to add more. * &#x60;internal_server_error&#x60; - 500: an error has occured on Lob&#39;s servers. Please try request again. * &#x60;invalid&#x60; - 422: an invalid request was made. See error message for details. * &#x60;not_deletable&#x60; - 422: an attempt was made to delete a resource, but the resource cannot be deleted. * &#x60;not_found&#x60; - 404: the requested resource was not found. * &#x60;request_timeout&#x60; - 408: the request took too long. Please try again. * &#x60;service_unavailable&#x60; - 503: the Lob servers are temporarily unavailable. Please try agian. * &#x60;unrecognized_endpoint&#x60; - 404: the requested endpoint doesn&#39;t exist. * &#x60;unsupported_lob_version&#x60; - 422: an unsupported Lob API version was requested.  **ADVANCED** * &#x60;address_length_exceeds_limit&#x60; - 422: the sum of to.address_line1 and to.address_line2 cannot surpass 50 characters. * &#x60;bank_account_already_verified&#x60; - 422: the bank account has already been verified. * &#x60;bank_error&#x60; - 422: there&#39;s an issue with the bank account. * &#x60;billing_address_required&#x60; - 403: in order to create a live mail piece, your account needs to set up a billing address. * &#x60;custom_envelope_inventory_depleted&#x60; - 422: custom envelope inventory is depleted, and more will need to be ordered. * &#x60;deleted_bank_account&#x60; - 404: checks cannot be created with a deleted bank account. * &#x60;failed_deliverability_strictness&#x60; - 422: the &#x60;to&#x60; address doesn&#39;t meet strictness requirements. See &lt;a href&#x3D;\&quot;https://dashboard.lob.com/#/settings/account\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Account Settings&lt;/a&gt; to configure strictness. * &#x60;file_pages_below_min&#x60; - 422: not enough pages. * &#x60;file_pages_exceed_max&#x60; - 422: too many pages. * &#x60;file_size_exceeds_limit&#x60; - 422: the file size is too large. See description for details. * &#x60;foreign_return_address&#x60; - 422: the &#x60;from&#x60; address must be a US address. * &#x60;inconsistent_page_dimensions&#x60; - 422: all pages of the input file must have the same dimensions. * &#x60;invalid_bank_account&#x60; - 422: the provided bank routing number is invalid. * &#x60;invalid_bank_account_verification&#x60; - 422: verification amounts do not match. * &#x60;invalid_check_international&#x60; - 422: checks cannot be sent internationally. * &#x60;invalid_country_covid&#x60; - 422: the postal service in the specified country is currently unable to process the request due to COVID-19 restrictions. * &#x60;invalid_file&#x60; - 422: the file is invalid. * &#x60;invalid_file_dimensions&#x60; - 422: file dimensions are incorrect for the selected mail type. * &#x60;invalid_file_download_time&#x60; - 422: file download from remote server took too long. * &#x60;invalid_file_url&#x60; - 422: the file URL when creating a resource is invalid. * &#x60;invalid_image_dpi&#x60; - 422: DPI must be at least 300. * &#x60;invalid_international_feature&#x60; - 422: the specified product cannot be sent to the destination. * &#x60;invalid_perforation_return_envelope&#x60; - 422: both &#x60;return_envelope&#x60; and &#x60;perforation&#x60; must be used together. * &#x60;invalid_template_html&#x60; - 422: the provided HTML is invalid. * &#x60;mail_use_type_can_not_be_null&#x60; - 422: use_type must be one of \&quot;marketing\&quot; or \&quot;operational\&quot;. Alternatively, an admin can set the account default use type in Account Settings. * &#x60;merge_variable_required&#x60; - 422: a required merge variable is missing. * &#x60;merge_variable_whitespace&#x60; - 422: merge variable names cannot contain whitespace. * &#x60;payment_method_unverified&#x60; - 401: you must have a verified bank account or credit card to submit live requests. * &#x60;pdf_encrypted&#x60; - 422: an encrypted PDF was provided. * &#x60;special_characters_restricted&#x60; - 422: cannot use special characters for merge variable names. * &#x60;unembedded_fonts&#x60; - 422: the provided PDF contains non-standard unembedded fonts. See description for details.  **AUTHENTICATION** * &#x60;email_required&#x60; - 401: account must have a verified email address before creating live resources. * &#x60;invalid_api_key&#x60; - 401/403: the API key is invalid. * &#x60;publishable_key_not_allowed&#x60; - 403: the requested operation needs a secret key, not a publishable key. See [API Keys](#section/API-Keys) for more information. * &#x60;rate_limit_exceeded&#x60; - 429: requests were sent too quickly and must be slowed down. * &#x60;unauthorized&#x60; - 401: the request isn&#39;t authorized. * &#x60;unauthorized_token&#x60; - 401: token isn&#39;t authorized.  |  |



## Enum: CodeEnum

| Name | Value |
|---- | -----|
| BAD_REQUEST | &quot;bad_request&quot; |
| CONFLICT | &quot;conflict&quot; |
| FEATURE_LIMIT_REACHED | &quot;feature_limit_reached&quot; |
| INTERNAL_SERVER_ERROR | &quot;internal_server_error&quot; |
| INVALID | &quot;invalid&quot; |
| NOT_DELETABLE | &quot;not_deletable&quot; |
| NOT_FOUND | &quot;not_found&quot; |
| REQUEST_TIMEOUT | &quot;request_timeout&quot; |
| SERVICE_UNAVAILABLE | &quot;service_unavailable&quot; |
| UNRECOGNIZED_ENDPOINT | &quot;unrecognized_endpoint&quot; |
| UNSUPPORTED_LOB_VERSION | &quot;unsupported_lob_version&quot; |
| ADDRESS_LENGTH_EXCEEDS_LIMIT | &quot;address_length_exceeds_limit&quot; |
| BANK_ACCOUNT_ALREADY_VERIFIED | &quot;bank_account_already_verified&quot; |
| BANK_ERROR | &quot;bank_error&quot; |
| BILLING_ADDRESS_REQUIRED | &quot;billing_address_required&quot; |
| CUSTOM_ENVELOPE_INVENTORY_DEPLETED | &quot;custom_envelope_inventory_depleted&quot; |
| DELETED_BANK_ACCOUNT | &quot;deleted_bank_account&quot; |
| FAILED_DELIVERABILITY_STRICTNESS | &quot;failed_deliverability_strictness&quot; |
| FILE_PAGES_BELOW_MIN | &quot;file_pages_below_min&quot; |
| FILE_PAGES_EXCEED_MAX | &quot;file_pages_exceed_max&quot; |
| FILE_SIZE_EXCEEDS_LIMIT | &quot;file_size_exceeds_limit&quot; |
| FOREIGN_RETURN_ADDRESS | &quot;foreign_return_address&quot; |
| INCONSISTENT_PAGE_DIMENSIONS | &quot;inconsistent_page_dimensions&quot; |
| INVALID_BANK_ACCOUNT | &quot;invalid_bank_account&quot; |
| INVALID_BANK_ACCOUNT_VERIFICATION | &quot;invalid_bank_account_verification&quot; |
| INVALID_CHECK_INTERNATIONAL | &quot;invalid_check_international&quot; |
| INVALID_COUNTRY_COVID | &quot;invalid_country_covid&quot; |
| INVALID_FILE | &quot;invalid_file&quot; |
| INVALID_FILE_DIMENSIONS | &quot;invalid_file_dimensions&quot; |
| INVALID_FILE_DOWNLOAD_TIME | &quot;invalid_file_download_time&quot; |
| INVALID_FILE_URL | &quot;invalid_file_url&quot; |
| INVALID_IMAGE_DPI | &quot;invalid_image_dpi&quot; |
| INVALID_INTERNATIONAL_FEATURE | &quot;invalid_international_feature&quot; |
| INVALID_PERFORATION_RETURN_ENVELOPE | &quot;invalid_perforation_return_envelope&quot; |
| INVALID_TEMPLATE_HTML | &quot;invalid_template_html&quot; |
| MAIL_USE_TYPE_CAN_NOT_BE_NULL | &quot;mail_use_type_can_not_be_null&quot; |
| MERGE_VARIABLE_REQUIRED | &quot;merge_variable_required&quot; |
| MERGE_VARIABLE_WHITESPACE | &quot;merge_variable_whitespace&quot; |
| PAYMENT_METHOD_UNVERIFIED | &quot;payment_method_unverified&quot; |
| PDF_ENCRYPTED | &quot;pdf_encrypted&quot; |
| SPECIAL_CHARACTERS_RESTRICTED | &quot;special_characters_restricted&quot; |
| UNEMBEDDED_FONTS | &quot;unembedded_fonts&quot; |
| EMAIL_REQUIRED | &quot;email_required&quot; |
| INVALID_API_KEY | &quot;invalid_api_key&quot; |
| PUBLISHABLE_KEY_NOT_ALLOWED | &quot;publishable_key_not_allowed&quot; |
| RATE_LIMIT_EXCEEDED | &quot;rate_limit_exceeded&quot; |
| UNAUTHORIZED | &quot;unauthorized&quot; |
| UNAUTHORIZED_TOKEN | &quot;unauthorized_token&quot; |



