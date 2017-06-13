(ns groceryapi.core
  (:require [groceryapi.db :as catalog]))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/json"}
   :body (clojure.string/join "\n" (catalog/catalog))})
