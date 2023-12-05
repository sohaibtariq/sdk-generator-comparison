/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi;

import org.openapis.openapi.utils.HTTPClient;
import org.openapis.openapi.utils.SpeakeasyHTTPClient;

/**
 * Lob: The Lob API is organized around REST. Our API is designed to have predictable, resource-oriented URLs and uses HTTP response codes to indicate any API errors. &lt;p&gt;
 * 
 */
public class SDK {
	/**
	 * SERVERS contains the list of server urls available to the SDK.
	 */
	public static final String[] SERVERS = {
        /**
         * production
         */
        "https://api.lob.com/v1",
	};
  	
    /**
     * To add an address to your address book, you create a new address object. You can retrieve and delete individual
     * addresses as well as get a list of addresses. Addresses are identified by a unique random ID.
     * &lt;div class="back-to-top" &gt;&lt;a href="#" onclick="toTopLink()"&gt;back to top&lt;/a&gt;&lt;/div&gt;
     * 
     */
    public Addresses addresses;
    /**
     * Bank Accounts allow you to store your bank account securely in our system. The API provides
     * endpoints for creating bank accounts, deleting bank accounts, verifying bank accounts,
     * retrieving individual bank accounts, and retrieving a list of bank accounts.
     * &lt;div class="back-to-top" &gt;&lt;a href="#" onclick="toTopLink()"&gt;back to top&lt;/a&gt;&lt;/div&gt;
     * 
     */
    public BankAccounts bankAccounts;
    /**
     * The Billing Groups API allows you to create and view labels that can be attached to certain consumption-based
     * usages of Letters, Checks, Postcards and Self-Mailers to customize your bill. Please check each
     * resource API section to learn more about how to access the Billing Groups API.
     * &lt;div class="back-to-top" &gt;&lt;a href="#" onclick="toTopLink()"&gt;back to top&lt;/a&gt;&lt;/div&gt;
     * 
     */
    public BillingGroups billingGroups;
    /**
     * The Buckslips endpoint allows you to easily create buckslips that can later be used as add-ons for Letters Campaigns. Note that a Letter Campaign with Buckslip add-on requires a minimum send quantity of 5,000 letters.
     * The API provides endpoints for creating buckslips, retrieving individual buckslips, creating buckslip orders, and retrieving a list of buckslips.
     * &lt;div class="back-to-top" &gt;&lt;a href="#" onclick="toTopLink()"&gt;back to top&lt;/a&gt;&lt;/div&gt;
     * 
     */
    public Buckslips buckslips;
    /**
     * The Buckslip Orders endpoint allows you to easily create buckslip orders for existing buckslips.
     * The API provides endpoints for creating buckslip orders and listing buckslip orders for a given buckslip.
     * &lt;div class="back-to-top" &gt;&lt;a href="#" onclick="toTopLink()"&gt;back to top&lt;/a&gt;&lt;/div&gt;
     * 
     */
    public BuckslipOrders buckslipOrders;
    /**
     * Validate, automatically correct, and standardize the addresses in your
     * address book based on USPS's &lt;a href="https://postalpro.usps.com/certifications/cass" target="_blank"&gt;Coding Accuracy Support System (CASS)&lt;/a&gt;.
     * &lt;br&gt;
     * &lt;div class="back-to-top" &gt;&lt;a href="#" onclick="toTopLink()"&gt;back to top&lt;/a&gt;&lt;/div&gt;
     * 
     * ## US Verifications Test Env
     * 
     * When verifying US addresses, you'll likely want to test against a wide array of addresses to
     * ensure you're handling responses correctly. With your test API key, requests that use specific
     * values for `address` or `primary_line` and (if using `primary_line`) an arbitrary five digit
     * number for `zip_code` (e.g. "11111") let you explore the responses to many types of addresses:
     * 
     * &lt;table&gt;
     *   &lt;tr&gt;
     *     &lt;th style="white-space: nowrap"&gt;ADDRESS TYPE FOR SAMPLE RESPONSE&lt;/th&gt;
     *     &lt;th style="white-space: nowrap"&gt;DELIVERABILITY&lt;/th&gt;
     *     &lt;th style="white-space: nowrap"&gt;SET &lt;code&gt;primary_line&lt;/code&gt; OR &lt;code&gt;address&lt;/code&gt; TO&lt;/th&gt;
     *   &lt;/tr&gt;
     *   &lt;tr&gt;
     *     &lt;td style="white-space: nowrap"&gt;Commercial highrise&lt;/td&gt;
     *     &lt;td style="white-space: nowrap"&gt;&lt;code&gt;deliverable&lt;/code&gt;&lt;/td&gt;
     *     &lt;td style="white-space: nowrap"&gt;&lt;code&gt;commercial highrise&lt;/code&gt;&lt;/td&gt;
     *   &lt;/tr&gt;
     *   &lt;tr&gt;
     *     &lt;td style="white-space: nowrap"&gt;Residential highrise&lt;/td&gt;
     *     &lt;td style="white-space: nowrap"&gt;&lt;code&gt;deliverable&lt;/code&gt;&lt;/td&gt;
     *     &lt;td style="white-space: nowrap"&gt;&lt;code&gt;residential highrise&lt;/code&gt;&lt;/td&gt;
     *   &lt;/tr&gt;
     *   &lt;tr&gt;
     *     &lt;td style="white-space: nowrap"&gt;Residential house&lt;/td&gt;
     *     &lt;td style="white-space: nowrap"&gt;&lt;code&gt;deliverable&lt;/code&gt;&lt;/td&gt;
     *     &lt;td style="white-space: nowrap"&gt;&lt;code&gt;residential house&lt;/code&gt;&lt;/td&gt;
     *   &lt;/tr&gt;
     *   &lt;tr&gt;
     *     &lt;td style="white-space: nowrap"&gt;PO Box&lt;/td&gt;
     *     &lt;td style="white-space: nowrap"&gt;&lt;code&gt;deliverable&lt;/code&gt;&lt;/td&gt;
     *     &lt;td style="white-space: nowrap"&gt;&lt;code&gt;po box&lt;/code&gt;&lt;/td&gt;
     *   &lt;/tr&gt;
     *   &lt;tr&gt;
     *     &lt;td style="white-space: nowrap"&gt;Rural route&lt;/td&gt;
     *     &lt;td style="white-space: nowrap"&gt;&lt;code&gt;deliverable&lt;/code&gt;&lt;/td&gt;
     *     &lt;td style="white-space: nowrap"&gt;&lt;code&gt;rural route&lt;/code&gt;&lt;/td&gt;
     *   &lt;/tr&gt;
     *   &lt;tr&gt;
     *     &lt;td style="white-space: nowrap"&gt;Puerty Rico address w/ urbanization&lt;/td&gt;
     *     &lt;td style="white-space: nowrap"&gt;&lt;code&gt;deliverable&lt;/code&gt;&lt;/td&gt;
     *     &lt;td style="white-space: nowrap"&gt;&lt;code&gt;puerto rico&lt;/code&gt;&lt;/td&gt;
     *   &lt;/tr&gt;
     *   &lt;tr&gt;
     *     &lt;td style="white-space: nowrap"&gt;Military address&lt;/td&gt;
     *     &lt;td style="white-space: nowrap"&gt;&lt;code&gt;deliverable&lt;/code&gt;&lt;/td&gt;
     *     &lt;td style="white-space: nowrap"&gt;&lt;code&gt;military&lt;/code&gt;&lt;/td&gt;
     *   &lt;/tr&gt;
     *   &lt;tr&gt;
     *     &lt;td style="white-space: nowrap"&gt;Department of state&lt;/td&gt;
     *     &lt;td style="white-space: nowrap"&gt;&lt;code&gt;deliverable&lt;/code&gt;&lt;/td&gt;
     *     &lt;td style="white-space: nowrap"&gt;&lt;code&gt;department of state&lt;/code&gt;&lt;/td&gt;
     *   &lt;/tr&gt;
     *   &lt;tr&gt;
     *     &lt;td style="white-space: nowrap"&gt;Generic deliverable&lt;/td&gt;
     *     &lt;td style="white-space: nowrap"&gt;&lt;code&gt;deliverable&lt;/code&gt;&lt;/td&gt;
     *     &lt;td style="white-space: nowrap"&gt;&lt;code&gt;deliverable&lt;/code&gt;&lt;/td&gt;
     *   &lt;/tr&gt;
     *   &lt;tr&gt;
     *     &lt;td style="white-space: nowrap"&gt;Missing a suite number&lt;/td&gt;
     *     &lt;td style="white-space: nowrap"&gt;&lt;code&gt;deliverable_missing_unit&lt;/code&gt;&lt;/td&gt;
     *     &lt;td style="white-space: nowrap"&gt;&lt;code&gt;missing unit&lt;/code&gt;&lt;/td&gt;
     *   &lt;/tr&gt;
     *   &lt;tr&gt;
     *     &lt;td style="white-space: nowrap"&gt;Suite number doesn't exist&lt;/td&gt;
     *     &lt;td style="white-space: nowrap"&gt;&lt;code&gt;deliverable_incorrect_unit&lt;/code&gt;&lt;/td&gt;
     *     &lt;td style="white-space: nowrap"&gt;&lt;code&gt;incorrect unit&lt;/code&gt;&lt;/td&gt;
     *   &lt;/tr&gt;
     *   &lt;tr&gt;
     *     &lt;td style="white-space: nowrap"&gt;Residential house with unnecessary suite number&lt;/td&gt;
     *     &lt;td style="white-space: nowrap"&gt;&lt;code&gt;deliverable_unnecessary_unit&lt;/code&gt;&lt;/td&gt;
     *     &lt;td style="white-space: nowrap"&gt;&lt;code&gt;unnecessary unit&lt;/code&gt;&lt;/td&gt;
     *   &lt;/tr&gt;
     *   &lt;tr&gt;
     *     &lt;td style="white-space: nowrap"&gt;Undeliverable and block matched&lt;/td&gt;
     *     &lt;td style="white-space: nowrap"&gt;&lt;code&gt;undeliverable&lt;/code&gt;&lt;/td&gt;
     *     &lt;td style="white-space: nowrap"&gt;&lt;code&gt;undeliverable block match&lt;/code&gt;&lt;/td&gt;
     *   &lt;/tr&gt;
     *   &lt;tr&gt;
     *     &lt;td style="white-space: nowrap"&gt;Undeliverable and no block matched&lt;/td&gt;
     *     &lt;td style="white-space: nowrap"&gt;&lt;code&gt;undeliverable&lt;/code&gt;&lt;/td&gt;
     *     &lt;td style="white-space: nowrap"&gt;&lt;code&gt;undeliverable no match&lt;/code&gt;&lt;/td&gt;
     *   &lt;/tr&gt;
     * &lt;/table&gt;
     * 
     * See the `test` request &amp; response examples under [US Verification Examples](#operation/us_verification) within the
     * "Verify a US or US territory address" section in US Verifications.
     * 
     * You can rely on the response from these examples generally matching the response you'd see in the live environment with an
     * address of that type (excluding the `recipient` field).
     * 
     * The test API key does not perform any verification, automatic correction, or standardization for addresses. If you wish to
     * try these features out, use our &lt;a href="https://lob.com/address-verification" target="_blank"&gt;live demo&lt;/a&gt; or the free plan (see &lt;a href="https://lob.com/pricing/address-verification" target="_blank"&gt;our pricing&lt;/a&gt; for details).
     * &lt;div class="back-to-top" &gt;&lt;a href="#" onclick="toTopLink()"&gt;back to top&lt;/a&gt;&lt;/div&gt;
     * 
     */
    public USVerifications usVerifications;
    /**
     * Address verification for non-US addresses
     * &lt;br&gt;
     * &lt;div class="back-to-top" &gt;&lt;a href="#" onclick="toTopLink()"&gt;back to top&lt;/a&gt;&lt;/div&gt;
     * 
     * ## Intl Verifications Test Env
     * 
     * When verifying international addresses, you'll likely want to test against
     * a wide array of addresses to ensure you're handling responses correctly.
     * With your test API key, requests that use specific values for `primary_line`
     * let you explore the responses to many types of addresses:
     * 
     * &lt;table&gt;
     *   &lt;tr&gt;
     *     &lt;th style="white-space: nowrap"&gt;DELIVERABILITY OF SAMPLE RESPONSE&lt;/th&gt;
     *     &lt;th style="white-space: nowrap"&gt;SET &lt;code&gt;primary_line&lt;/code&gt; TO&lt;/th&gt;
     *   &lt;/tr&gt;
     *   &lt;tr&gt;
     *     &lt;td style="white-space: nowrap"&gt;&lt;code&gt;deliverable&lt;/code&gt;&lt;/td&gt;
     *     &lt;td style="white-space: nowrap"&gt;deliverable&lt;/td&gt;
     *   &lt;/tr&gt;
     *   &lt;tr&gt;
     *     &lt;td style="white-space: nowrap"&gt;&lt;code&gt;deliverable_missing_info&lt;/code&gt;&lt;/td&gt;
     *     &lt;td style="white-space: nowrap"&gt;deliverable missing info&lt;/td&gt;
     *   &lt;/tr&gt;
     *   &lt;tr&gt;
     *     &lt;td style="white-space: nowrap"&gt;&lt;code&gt;undeliverable&lt;/code&gt;&lt;/td&gt;
     *     &lt;td style="white-space: nowrap"&gt;undeliverable&lt;/td&gt;
     *   &lt;/tr&gt;
     *   &lt;tr&gt;
     *     &lt;td style="white-space: nowrap"&gt;&lt;code&gt;no_match&lt;/code&gt;&lt;/td&gt;
     *     &lt;td style="white-space: nowrap"&gt;no match&lt;/td&gt;
     *   &lt;/tr&gt;
     * &lt;/table&gt;
     * 
     * See the `test` request &amp; response examples under [Intl Verification Examples](#operation/intl_verification) within the
     * "Verify an international address section" in Intl Verifications.
     * 
     * You can rely on the response from these examples generally matching the response
     * you'd see in the live environment with an address of that type (excluding the `recipient` field).
     * 
     * The test API key does not perform any verification, automatic correction, or standardization
     * for addresses. If you wish to try these features out, use our &lt;a href="https://lob.com/address-verification" target="_blank"&gt;live demo&lt;/a&gt;
     * or the free plan (see &lt;a href="https://lob.com/pricing/address-verification" target="_blank"&gt;our pricing&lt;/a&gt; for details).
     * &lt;div class="back-to-top" &gt;&lt;a href="#" onclick="toTopLink()"&gt;back to top&lt;/a&gt;&lt;/div&gt;
     * 
     */
    public IntlVerifications intlVerifications;
    /**
     * The campaigns endpoint allows you to create and view campaigns that can be used to send multiple letters or postcards.
     * The API provides endpoints for creating campaigns, updating campaigns, retrieving individual campaigns, listing campaigns, and deleting
     * campaigns.
     * 
     */
    public Campaigns campaigns;
    /**
     * The cards endpoint allows you to easily create cards that can later be affixed to Letters.
     * The API provides endpoints for creating cards, retrieving individual cards, creating card orders, and retrieving a list of cards.
     * &lt;div class="back-to-top" &gt;&lt;a href="#" onclick="toTopLink()"&gt;back to top&lt;/a&gt;&lt;/div&gt;
     * 
     */
    public Cards cards;
    /**
     * The card orders endpoint allows you to easily create card orders for existing cards.
     * The API provides endpoints for creating card orders and listing card orders for a given card.
     * &lt;div class="back-to-top" &gt;&lt;a href="#" onclick="toTopLink()"&gt;back to top&lt;/a&gt;&lt;/div&gt;
     * 
     */
    public CardOrders cardOrders;
    /**
     * Checks allow you to send payments via physical checks. The API provides endpoints
     * for creating checks, retrieving individual checks, canceling checks, and retrieving a list of checks.
     * &lt;div class="back-to-top" &gt;&lt;a href="#" onclick="toTopLink()"&gt;back to top&lt;/a&gt;&lt;/div&gt;
     * 
     */
    public Checks checks;
    /**
     * The creatives endpoint allows you to create and view creatives. Creatives are used to create
     * reusable letter and postcard templates. The API provides endpoints for creating creatives, updating creatives,
     * retrieving individual creatives, and deleting creatives.
     * 
     */
    public Creatives creatives;
    /**
     * Validates whether a given name is associated with an address.
     * &lt;div class="back-to-top" &gt;&lt;a href="#" onclick="toTopLink()"&gt;back to top&lt;/a&gt;&lt;/div&gt;
     * 
     */
    public IdentityValidation identityValidation;
    /**
     * Address autocompletion for non-US addresses. Given partial address information, this endpoint returns up to 10 address suggestions.
     * ## Autocompletion Test Env
     * Your test API key does not autocomplete international addresses and is used to simulate
     * behavior. With your test API key, requests with specific values for `address_prefix`
     * return predetermined values. When `address_prefix` is set to:
     * - `0 suggestions` - Returns no suggestions
     * - `[PRIMARY NUMBER] s[uggestion]` - Returns a maximum of ten predefined suggested addresses.
     *   `[PRIMARY NUMBER]` does not have to be a valid primary number when sending a test request.
     *   Each additional letter in `suggestion` reduces the number of suggestions by one (e.g.
     *   `1 su` returns 9 suggested addresses). `[PRIMARY NUMBER]` does not affect the number of
     *   suggestions returned.
     * Country is a required field.
     * City and state filters work as expected and filter the list of predetermined suggested addresses.
     * See the `test` request &amp; response examples under [Autocomplete Examples](#operation/intl_autocompletions) within the "Autocomplete
     * a partial address" section in Intl Autocompletions.
     * &lt;div class="back-to-top" &gt;&lt;a href="#" onclick="toTopLink()"&gt;back to top&lt;/a&gt;&lt;/div&gt;
     * 
     */
    public IntlAutocompletions intlAutocompletions;
    /**
     * The letters endpoint allows you to easily print and mail letters. The API provides endpoints for
     * creating letters, retrieving individual letters, canceling letters, and retrieving a list of letters.
     * &lt;div class="back-to-top" &gt;&lt;a href="#" onclick="toTopLink()"&gt;back to top&lt;/a&gt;&lt;/div&gt;
     * 
     */
    public Letters letters;
    /**
     * The postcards endpoint allows you to easily print and mail postcards. The API provides endpoints for creating postcards,
     * retrieving individual postcards, canceling postcards, and retrieving a list of postcards.
     * &lt;div class="back-to-top" &gt;&lt;a href="#" onclick="toTopLink()"&gt;back to top&lt;/a&gt;&lt;/div&gt;
     * 
     */
    public Postcards postcards;
    /**
     * Lob QR codes allow you to generate a QR code that is unique to each mailpiece, thereby allowing each and every customers to receive a personalized link. See the Create endpoint for &lt;a href="#tag/Letters/operation/letter_create"&gt;Letters&lt;/a&gt;, &lt;a href="#tag/Postcards/operation/postcard_create"&gt;Postcards&lt;/a&gt; or &lt;a href="#tag/Self-Mailers/operation/self_mailer_create"&gt;Self Mailers&lt;/a&gt; to learn how to embed a QR code into your mail piece.
     * 
     * Webhooks can be used to integrate Lob QR code scans into your omni channel marketing strategy. See the &lt;a href="#tag/Webhooks"&gt;Webhooks&lt;/a&gt; section of our documentation to learn how to enable the `letter.viewed`, `postcard.viewed` and `self_mailer.viewed` event notifications for your mail pieces.
     * 
     * Furthermore, our QR code Analytics endpoint can be used to track the impact and engagement rate of your mail sends. Lob can tell you exactly which recipients opened your mailpiece. Our Analytics endpoint allows you to see exactly which recipient scanned a mailpiece, when they scanned it, and more!
     * 
     * &lt;div class="back-to-top" &gt;&lt;a href="#" onclick="toTopLink()"&gt;back to top&lt;/a&gt;&lt;/div&gt;
     * 
     */
    public QRCodes qrCodes;
    /**
     * Lob's URL shortener allows you to generate unique short links, either with Lob's own domain or your own custom domains. Each custom link enables Lob to track mail individually and provide customers the relevant tracking data in their dashboard.
     * 
     * Webhooks can be used to integrate Lob's URL Shortener scans into your omni channel marketing stratergy. See the &lt;a href="#tag/Webhooks"&gt;Webhooks&lt;/a&gt; section of our documentation to learn how to enable the `letter.viewed`, `postcard.viewed` and `self_mailer.viewed` event notifications for your mail pieces.
     * 
     * Furthermore, you can use our Retrieve endpoints to track the impact and engagement rate of links created. 
     * 
     * &lt;div class="back-to-top" &gt;&lt;a href="#" onclick="toTopLink()"&gt;back to top&lt;/a&gt;&lt;/div&gt;
     * 
     */
    public URLShortener urlShortener;
    /**
     * The self mailer endpoint allows you to easily print and mail self mailers. The API provides endpoints
     * for creating self mailers, retrieving individual self mailers, canceling self mailers, and retrieving a list of self mailers.
     * &lt;div class="back-to-top" &gt;&lt;a href="#" onclick="toTopLink()"&gt;back to top&lt;/a&gt;&lt;/div&gt;
     * 
     */
    public SelfMailers selfMailers;
    /**
     * These API endpoints allow you to create, retrieve, update and delete versions of reusable HTML templates for use with the Print &amp; Mail API.
     * &lt;div class="back-to-top" &gt;&lt;a href="#" onclick="toTopLink()"&gt;back to top&lt;/a&gt;&lt;/div&gt;
     * 
     */
    public TemplateVersions templateVersions;
    /**
     * These API endpoints allow you to create, retrieve, update and delete reusable HTML templates for use with the Print &amp; Mail API.
     * &lt;div class="back-to-top" &gt;&lt;a href="#" onclick="toTopLink()"&gt;back to top&lt;/a&gt;&lt;/div&gt;
     * 
     */
    public Templates templates;
    /**
     * The uploads endpoint allows you to upload audience files that are then associated with a given campaign.
     * At this time, only CSV files are allowed. The API provides endpoints for creating uploads, uploading audience files,
     * and marking uploaded files as ready for processing. The API also provides endpoints for downloading files that
     * describe the results, both successful and not, of the processing.
     * 
     */
    public Uploads uploads;
    /**
     * Given partial address information, this endpoint returns up to 10 address suggestions. &lt;br&gt; &lt;div class="back-to-top" &gt;&lt;a href="#" onclick="toTopLink()"&gt;back to top&lt;/a&gt;&lt;/div&gt;
     * ## Autocompletion Test Env
     * Your test API key does not autocomplete US addresses and is used to simulate behavior. With your test API key, requests with specific values for `address_prefix` return predetermined values. When `address_prefix` is set to:
     * - `0 suggestions` - Returns no suggestions - `[PRIMARY NUMBER] s[uggestion]` - Returns a maximum of ten predefined suggested addresses.
     *   `[PRIMARY NUMBER]` does not have to be a valid primary number when sending a test request.
     *   Each additional letter in `suggestion` reduces the number of suggestions by one (e.g.
     *   `1 su` returns 9 suggested addresses). `[PRIMARY NUMBER]` does not affect the number of
     *   suggestions returned.
     * 
     * City and state filters work as expected and filter the list of predetermined suggested addresses.
     * See the `test` request &amp; response examples under [Autocomplete Examples](#operation/autocompletion) within the "Autocomplete a partial address" section in US Autocompletions. &lt;div class="back-to-top" &gt;&lt;a href="#" onclick="toTopLink()"&gt;back to top&lt;/a&gt;&lt;/div&gt;
     * 
     */
    public USAutocompletions usAutocompletions;
    /**
     * Find a list of zip codes associated with a valid US location via latitude and longitude. &lt;br&gt; &lt;div class="back-to-top" &gt;&lt;a href="#" onclick="toTopLink()"&gt;back to top&lt;/a&gt;&lt;/div&gt;
     * 
     */
    public ReverseGeocodeLookups reverseGeocodeLookups;
    /**
     * Find a list of cities, states and associated information about a US ZIP code. &lt;div class="back-to-top" &gt;&lt;a href="#" onclick="toTopLink()"&gt;back to top&lt;/a&gt;&lt;/div&gt;
     * 
     */
    public ZipLookups zipLookups;	

	private SDKConfiguration sdkConfiguration;

	/**
	 * The Builder class allows the configuration of a new instance of the SDK.
	 */
	public static class Builder {
		private SDKConfiguration sdkConfiguration = new SDKConfiguration();

		private Builder() {
		}

		/**
		 * Allows the default HTTP client to be overridden with a custom implementation.
		 * @param client The HTTP client to use for all requests.
		 * @return The builder instance.
		 */
		public Builder setClient(HTTPClient client) {
			this.sdkConfiguration.defaultClient = client;
			return this;
		}
		
		/**
		 * Configures the SDK to use the provided security details.
		 * @param security The security details to use for all requests.
		 * @return The builder instance.
		 */
		public Builder setSecurity(org.openapis.openapi.models.shared.Security security) {
			this.sdkConfiguration.security = security;
			return this;
		}
		
		/**
		 * Allows the overriding of the default server URL.
		 * @param serverUrl The server URL to use for all requests.
		 * @return The builder instance.
		 */
		public Builder setServerURL(String serverUrl) {
			this.sdkConfiguration.serverUrl = serverUrl;
			return this;
		}
		
		/**
		 * Allows the overriding of the default server URL  with a templated URL populated with the provided parameters.
		 * @param serverUrl The server URL to use for all requests.
		 * @param params The parameters to use when templating the URL.
		 * @return The builder instance.
		 */
		public Builder setServerURL(String serverUrl, java.util.Map<String, String> params) {
			this.sdkConfiguration.serverUrl = org.openapis.openapi.utils.Utils.templateUrl(serverUrl, params);
			return this;
		}
		
		/**
		 * Allows the overriding of the default server by index
		 * @param serverIdx The server to use for all requests.
		 * @return The builder instance.
		 */
		public Builder setServerIndex(int serverIdx) {
			this.sdkConfiguration.serverIdx = serverIdx;
			this.sdkConfiguration.serverUrl = SERVERS[serverIdx];
			return this;
		}
		
		/**
		 * Builds a new instance of the SDK.
		 * @return The SDK instance.
		 * @throws Exception Thrown if the SDK could not be built.
		 */
		public SDK build() throws Exception {
			if (this.sdkConfiguration.defaultClient == null) {
				this.sdkConfiguration.defaultClient = new SpeakeasyHTTPClient();
			}
			
			if (this.sdkConfiguration.security != null) {
				this.sdkConfiguration.securityClient = org.openapis.openapi.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, this.sdkConfiguration.security);
			}
			
			if (this.sdkConfiguration.securityClient == null) {
				this.sdkConfiguration.securityClient = this.sdkConfiguration.defaultClient;
			}
			
			if (this.sdkConfiguration.serverUrl == null || this.sdkConfiguration.serverUrl.isBlank()) {
				this.sdkConfiguration.serverUrl = SERVERS[0];
				this.sdkConfiguration.serverIdx = 0;
			}

			if (this.sdkConfiguration.serverUrl.endsWith("/")) {
				this.sdkConfiguration.serverUrl = this.sdkConfiguration.serverUrl.substring(0, this.sdkConfiguration.serverUrl.length() - 1);
			}
			
			return new SDK(this.sdkConfiguration);
		}
	}

	/**
	 * Get a new instance of the SDK builder to configure a new instance of the SDK.
	 * @return The SDK builder instance.
	 */
	public static Builder builder() {
		return new Builder();
	}

	private SDK(SDKConfiguration sdkConfiguration) throws Exception {
		this.sdkConfiguration = sdkConfiguration;
		
		this.addresses = new Addresses(this.sdkConfiguration);
		
		this.bankAccounts = new BankAccounts(this.sdkConfiguration);
		
		this.billingGroups = new BillingGroups(this.sdkConfiguration);
		
		this.buckslips = new Buckslips(this.sdkConfiguration);
		
		this.buckslipOrders = new BuckslipOrders(this.sdkConfiguration);
		
		this.usVerifications = new USVerifications(this.sdkConfiguration);
		
		this.intlVerifications = new IntlVerifications(this.sdkConfiguration);
		
		this.campaigns = new Campaigns(this.sdkConfiguration);
		
		this.cards = new Cards(this.sdkConfiguration);
		
		this.cardOrders = new CardOrders(this.sdkConfiguration);
		
		this.checks = new Checks(this.sdkConfiguration);
		
		this.creatives = new Creatives(this.sdkConfiguration);
		
		this.identityValidation = new IdentityValidation(this.sdkConfiguration);
		
		this.intlAutocompletions = new IntlAutocompletions(this.sdkConfiguration);
		
		this.letters = new Letters(this.sdkConfiguration);
		
		this.postcards = new Postcards(this.sdkConfiguration);
		
		this.qrCodes = new QRCodes(this.sdkConfiguration);
		
		this.urlShortener = new URLShortener(this.sdkConfiguration);
		
		this.selfMailers = new SelfMailers(this.sdkConfiguration);
		
		this.templateVersions = new TemplateVersions(this.sdkConfiguration);
		
		this.templates = new Templates(this.sdkConfiguration);
		
		this.uploads = new Uploads(this.sdkConfiguration);
		
		this.usAutocompletions = new USAutocompletions(this.sdkConfiguration);
		
		this.reverseGeocodeLookups = new ReverseGeocodeLookups(this.sdkConfiguration);
		
		this.zipLookups = new ZipLookups(this.sdkConfiguration);
	}
}