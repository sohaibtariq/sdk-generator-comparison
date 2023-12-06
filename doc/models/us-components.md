
# Us Components

A nested object containing a breakdown of each component of an address.

## Structure

`UsComponents`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PrimaryNumber` | `String` | Required | The numeric or alphanumeric part of an address preceding the street name. Often the house, building, or PO Box number. | String getPrimaryNumber() | setPrimaryNumber(String primaryNumber) |
| `StreetPredirection` | [`StreetPredirectionEnum`](../../doc/models/street-predirection-enum.md) | Required | Geographic direction preceding a street name (`N`, `S`, `E`, `W`, `NE`, `SW`, `SE`, `NW`). | StreetPredirectionEnum getStreetPredirection() | setStreetPredirection(StreetPredirectionEnum streetPredirection) |
| `StreetName` | `String` | Required | The name of the street. | String getStreetName() | setStreetName(String streetName) |
| `StreetSuffix` | `String` | Required | The standard USPS abbreviation for the street suffix (`ST`, `AVE`, `BLVD`, etc). | String getStreetSuffix() | setStreetSuffix(String streetSuffix) |
| `StreetPostdirection` | [`StreetPostdirectionEnum`](../../doc/models/street-postdirection-enum.md) | Required | Geographic direction following a street name (`N`, `S`, `E`, `W`, `NE`, `SW`, `SE`, `NW`). | StreetPostdirectionEnum getStreetPostdirection() | setStreetPostdirection(StreetPostdirectionEnum streetPostdirection) |
| `SecondaryDesignator` | `String` | Required | The standard USPS abbreviation describing the `components[secondary_number]` (`STE`, `APT`, `BLDG`, etc). | String getSecondaryDesignator() | setSecondaryDesignator(String secondaryDesignator) |
| `SecondaryNumber` | `String` | Required | Number of the apartment/unit/etc. | String getSecondaryNumber() | setSecondaryNumber(String secondaryNumber) |
| `PmbDesignator` | `String` | Required | Designator of a <a href="https://en.wikipedia.org/wiki/Commercial_mail_receiving_agency" target="_blank">CMRA-authorized</a> private mailbox. | String getPmbDesignator() | setPmbDesignator(String pmbDesignator) |
| `PmbNumber` | `String` | Required | Number of a <a href="https://en.wikipedia.org/wiki/Commercial_mail_receiving_agency" target="_blank">CMRA-authorized</a> private mailbox. | String getPmbNumber() | setPmbNumber(String pmbNumber) |
| `ExtraSecondaryDesignator` | `String` | Required | An extra (often unnecessary) secondary designator provided with the input address. | String getExtraSecondaryDesignator() | setExtraSecondaryDesignator(String extraSecondaryDesignator) |
| `ExtraSecondaryNumber` | `String` | Required | An extra (often unnecessary) secondary number provided with the input address. | String getExtraSecondaryNumber() | setExtraSecondaryNumber(String extraSecondaryNumber) |
| `City` | `String` | Required | **Constraints**: *Maximum Length*: `200` | String getCity() | setCity(String city) |
| `State` | `String` | Required | The <a href="https://en.wikipedia.org/wiki/ISO_3166-2" target="_blank">ISO 3166-2</a> two letter code for the state.<br>**Constraints**: *Maximum Length*: `2` | String getState() | setState(String state) |
| `ZipCode` | `String` | Required | The 5-digit ZIP code<br>**Constraints**: *Pattern*: `^\d{5}$` | String getZipCode() | setZipCode(String zipCode) |
| `ZipCodePlus4` | `String` | Required | **Constraints**: *Pattern*: `^\d{4}$` | String getZipCodePlus4() | setZipCodePlus4(String zipCodePlus4) |
| `ZipCodeType` | [`ZipCodeTypeEnum`](../../doc/models/zip-code-type-enum.md) | Required | A description of the ZIP code type. For more detailed information about<br>each ZIP code type, see [US Verification Details](#tag/US-Verification-Types). | ZipCodeTypeEnum getZipCodeType() | setZipCodeType(ZipCodeTypeEnum zipCodeType) |
| `DeliveryPointBarcode` | `String` | Required | A 12-digit identifier that uniquely identifies a delivery point (location where mail can be sent and received). It consists of the 5-digit ZIP code (`zip_code`), 4-digit ZIP+4 add-on (`zip_code_plus_4`), 2-digit delivery point, and 1-digit delivery point check digit. | String getDeliveryPointBarcode() | setDeliveryPointBarcode(String deliveryPointBarcode) |
| `AddressType` | [`AddressTypeEnum`](../../doc/models/address-type-enum.md) | Required | Uses USPS's <a href="https://www.usps.com/nationalpremieraccounts/rdi.htm" target="_blank">Residential Delivery Indicator (RDI)</a> to identify<br>whether an address is classified as residential or<br>business. Possible values are:<br><br>* `residential` –– The address is residential or a PO Box.<br>* `commercial` –– The address is commercial.<br>* `''` –– Not enough information provided to be determined. | AddressTypeEnum getAddressType() | setAddressType(AddressTypeEnum addressType) |
| `RecordType` | [`RecordTypeEnum`](../../doc/models/record-type-enum.md) | Required | A description of the type of address. Populated if a DPV match is made (`deliverability_analysis[dpv_confirmation]`<br>is `Y`, `S`, or `D`). For more detailed information about each record type, see<br>[US Verification Details](#tag/US-Verification-Types). | RecordTypeEnum getRecordType() | setRecordType(RecordTypeEnum recordType) |
| `DefaultBuildingAddress` | `boolean` | Required | Designates whether or not the address is the default address for a building containing multiple delivery points. | boolean getDefaultBuildingAddress() | setDefaultBuildingAddress(boolean defaultBuildingAddress) |
| `County` | `String` | Required | County name of the address city. | String getCounty() | setCounty(String county) |
| `CountyFips` | `String` | Required | A 5-digit <a href="https://en.wikipedia.org/wiki/FIPS_county_code" target="_blank">FIPS county code</a> which uniquely identifies `components[county]`. It consists of a 2-digit state code and a 3-digit county code.<br>**Constraints**: *Pattern*: `\d{5}` | String getCountyFips() | setCountyFips(String countyFips) |
| `CarrierRoute` | `String` | Required | A 4-character code assigned to a mail delivery route within a ZIP code. | String getCarrierRoute() | setCarrierRoute(String carrierRoute) |
| `CarrierRouteType` | [`CarrierRouteTypeEnum`](../../doc/models/carrier-route-type-enum.md) | Required | The type of `components[carrier_route]`. For more detailed information about<br>each carrier route type, see [US Verification Details](#tag/US-Verification-Types). | CarrierRouteTypeEnum getCarrierRouteType() | setCarrierRouteType(CarrierRouteTypeEnum carrierRouteType) |
| `Latitude` | `Double` | Optional | A positive or negative decimal indicating the geographic latitude of the address, specifying the north-to-south position of a location. This should be used with `longitude` to pinpoint locations on a map. Will not be returned for undeliverable addresses or military addresses (state is `AA`, `AE`, or `AP`). | Double getLatitude() | setLatitude(Double latitude) |
| `Longitude` | `Double` | Optional | A positive or negative decimal indicating the geographic longitude of the address, specifying the north-to-south position of a location. This should be used with `latitude` to pinpoint locations on a map. Will not be returned for undeliverable addresses or military addresses (state is `AA`, `AE`, or `AP`). | Double getLongitude() | setLongitude(Double longitude) |

## Example (as JSON)

```json
{
  "primary_number": "primary_number2",
  "street_predirection": "SE",
  "street_name": "street_name4",
  "street_suffix": "street_suffix2",
  "street_postdirection": "SE",
  "secondary_designator": "secondary_designator8",
  "secondary_number": "secondary_number4",
  "pmb_designator": "pmb_designator4",
  "pmb_number": "pmb_number8",
  "extra_secondary_designator": "extra_secondary_designator6",
  "extra_secondary_number": "extra_secondary_number8",
  "city": "city8",
  "state": "state2",
  "zip_code": "zip_code6",
  "zip_code_plus_4": "zip_code_plus_42",
  "zip_code_type": "standard",
  "delivery_point_barcode": "delivery_point_barcode8",
  "address_type": "residential",
  "record_type": "rural_route",
  "default_building_address": false,
  "county": "county4",
  "county_fips": "county_fips8",
  "carrier_route": "carrier_route2",
  "carrier_route_type": "po_box",
  "latitude": 45.84,
  "longitude": 207.96
}
```

