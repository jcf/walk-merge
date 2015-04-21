# clojure.walk

### 1.6.0

`lein with-profile 1.6 test`

```
lein test walk.merge-test

Ran 1 tests containing 1 assertions.
0 failures, 0 errors.
```

`lein with-profile 1.7 test`

### 1.7-beta1

```
lein test walk.merge-test

lein test :only walk.merge-test/test-walk-merge

FAIL in (test-walk-merge) (merge_test.clj:6)
expected: (= (keywordize-keys {:a 1, "a" 2}) {:a 1})
  actual: (not (= {:a 2} {:a 1}))

Ran 1 tests containing 1 assertions.
1 failures, 0 errors.
Tests failed.
Error encountered performing task 'test' with profile(s): '1.7'
Tests failed.
```
