# Pet

A single Pet object


## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        | Example                                                                            |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `id`                                                                               | *Long*                                                                             | :heavy_check_mark:                                                                 | a unique identifier for a Pet                                                      | 1234                                                                               |
| `name`                                                                             | *String*                                                                           | :heavy_check_mark:                                                                 | the name lovingly given to the pet                                                 | Fido                                                                               |
| `petType`                                                                          | [org.openapis.openapi.models.shared.PetPetType](../../models/shared/PetPetType.md) | :heavy_minus_sign:                                                                 | the type of pets allowed                                                           | dog                                                                                |