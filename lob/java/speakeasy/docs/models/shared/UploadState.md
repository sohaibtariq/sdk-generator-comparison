# UploadState

The `state` property on the `upload` object. As the file is processed, the `state` will change from `Ready for Validation` to `Validating` and then will be either `Scheduled` (successfully processed) or `Errored` (Unsuccessfully processed).


## Values

| Name                   | Value                  |
| ---------------------- | ---------------------- |
| `PREPROCESSING`        | Preprocessing          |
| `DRAFT`                | Draft                  |
| `READY_FOR_VALIDATION` | Ready for Validation   |
| `VALIDATING`           | Validating             |
| `SCHEDULED`            | Scheduled              |
| `CANCELLED`            | Cancelled              |
| `ERRORED`              | Errored                |