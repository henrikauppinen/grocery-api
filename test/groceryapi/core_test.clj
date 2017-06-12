(ns groceryapi.core-test
  (:require [clojure.test :refer :all]
            [groceryapi.core :refer :all]))

(deftest handler-returns-result
  (testing "Handler response status is 200"
    (is (= 200  (:status (handler "req"))))))
