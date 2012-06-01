# KT Models

## KT

An abstract class that implements the basic functionality of knowledge tracing:

* forward probabilities
* predictions
* knowledge curves
* performance curves

You set the parameters yourself; there is currently no way to learn them via expectation-maximization.

## KTHashMap

A memoized version of KT, using a hashmap to store computed values.

## KTMongo

A knowledge tracing model that uses a mongo database.  

WARNING: unimplemented.

## KTMySQL

A knowledge tracing model that uses a MySQL database.  

WARNING: unimplemented.

## KTPostgres

A knowledge tracing model that uses a postgres database.  

WARNING: unimplemented.

## KTStorageless

A knowledge tracing model that doesn't do any storage.  This is the lightest, in terms of memory.

# KT Collections

## KTCollection

Stores all of the models chosen in one big array.  This can be memory-intensive.

## PagingKTCollection

Made of many KTCollections with only one in memory at a time.  The rest are written to or loaded off disk as needed.

## HollowKTCollection

Instead of making many KT models, it only stores the total accumulated weights that would be represented for each of them.