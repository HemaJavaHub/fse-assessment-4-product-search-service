# Product Search Service
This is a complete product service used for the Angular portion of the assessment.

## Tasks
- Build and run this product microservice.  It will stand in as your back end for the Angular front end you are to complete.
- Use the models and endpoints in this service as a guide in building out your front end as spelled out in the requirements from that repo.

## Notes
- This repo does NOT need to be forked or turned in and will not be graded.  
- You MAY fork this repo for your future reference if desired.
- DO NOT make any changes to this code -  use As-Is.

## Operational Notes
- This service is configured to run on port 9990.
- To run this service, run the class `ProductSearchMain` in the `com.alisnobba.search` package.
- Using Postman, the following request/responses should be had when hitting the endpoint `localhost:9990/search`.
- In Postman, set Body to `raw` and select a content type of `JSON (application/json)` and the following requests should work.

Request 1 (Black Bottega Veneta dresses with a price range from $2000 to $2500)
```json
{
	"color":"black",
	"category":"dresses",
	"brand":"bottega veneta",
	"priceRangeUpper":"2500",
	"priceRangeLower":"2000"
}
```
Response 1
```json
[
    {
        "category": "dresses",
        "brand": "bottega veneta",
        "color": "black",
        "price": 2200
    }
]
```
---
Request 2 (Gucci dresses)
```json
{
	"category":"dresses",
	"brand":"gucci"
}
```
Response 2
```json
[
    {
        "category": "dresses",
        "brand": "gucci",
        "color": "yellow",
        "price": 2272
    },
    {
        "category": "dresses",
        "brand": "gucci",
        "color": "red",
        "price": 1966
    }
]
```
---
Request 3 (All records)
```json
{

}
```
Response 3
```json
[
    {
        "category": "dresses",
        "brand": "gucci",
        "color": "yellow",
        "price": 2272
    },
    {
        "category": "dresses",
        "brand": "gucci",
        "color": "red",
        "price": 1966
    },
    {
        "category": "dresses",
        "brand": "marni",
        "color": "brown",
        "price": 999
    },
    {
        "category": "dresses",
        "brand": "marni",
        "color": "pink",
        "price": 1129
    },
    {
        "category": "dresses",
        "brand": "bottega veneta",
        "color": "black",
        "price": 2200
    },
    {
        "category": "dresses",
        "brand": "prada",
        "color": "black",
        "price": 1650
    },
    {
        "category": "dresses",
        "brand": "victoria beckham",
        "color": "blue",
        "price": 927
    },
    {
        "category": "dresses",
        "brand": "celine",
        "color": "beige",
        "price": 1901
    },
    {
        "category": "dresses",
        "brand": "jil sander",
        "color": "orange",
        "price": 511
    }
]
```


