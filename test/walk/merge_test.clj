(ns walk.merge-test
  (:require [clojure.walk :refer [keywordize-keys]]
            [clojure.test :refer :all]))

(deftest test-walk-merge
  (is (= (keywordize-keys {:a 1 "a" 2}) {:a 1})))
