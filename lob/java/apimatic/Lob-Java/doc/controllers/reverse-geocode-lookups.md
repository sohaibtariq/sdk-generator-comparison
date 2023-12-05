# Reverse Geocode Lookups

```java
ReverseGeocodeLookupsController reverseGeocodeLookupsController = client.getReverseGeocodeLookupsController();
```

## Class Name

`ReverseGeocodeLookupsController`


# Reverse Geocode Lookup

Reverse geocode a valid US location with a live API key.

```java
CompletableFuture<ReverseGeocode> reverseGeocodeLookupAsync(
    final Double latitude,
    final Double longitude,
    final Integer size)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `latitude` | `Double` | Form, Required | A positive or negative decimal indicating the geographic latitude of the address, specifying the north-to-south position of a location. This should be input with `longitude` to pinpoint locations on a map.<br>**Constraints**: `>= -90`, `<= 90` |
| `longitude` | `Double` | Form, Required | A positive or negative decimal indicating the geographic longitude of the address, specifying the north-to-south position of a location. This should be input with `latitude` to pinpoint locations on a map.<br>**Constraints**: `>= -180`, `<= 180` |
| `size` | `Integer` | Query, Optional | Determines the number of locations returned. Possible values are between 1 and 50 and any number higher will be rounded down to 50. Default size is a list of 5 reverse geocoded locations.<br>**Default**: `5`<br>**Constraints**: `>= 1`, `<= 50` |

## Response Type

[`ReverseGeocode`](../../doc/models/reverse-geocode.md)

## Example Usage

```java
Double latitude = 37.7749D;
Double longitude = 122.4194D;
Integer size = 5;

reverseGeocodeLookupsController.reverseGeocodeLookupAsync(latitude, longitude, size).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "us_reverse_geocode_8a013f3e",
  "addresses": [
    {
      "components": {
        "zip_code": "94107",
        "zip_code_plus_4": "1702"
      },
      "location_analysis": {
        "latitude": 37.78271,
        "longitude": -122.416202,
        "distance": 1.32
      }
    },
    {
      "components": {
        "zip_code": "94107",
        "zip_code_plus_4": "1702"
      },
      "location_analysis": {
        "latitude": 37.782917,
        "longitude": -122.416131,
        "distance": 1.33
      }
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](../../doc/models/error-error-exception.md) |

