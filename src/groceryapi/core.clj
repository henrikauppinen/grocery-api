(ns groceryapi.core
  (:require [groceryapi.db :as catalog]
            [compojure.core :refer :all]
            [compojure.route :as route]))

;(defn handler [request]
;  {:status 200
;   :headers {"Content-Type" "text/json"}
;   :body (clojure.string/join "\n" (catalog/catalog))})

(defroutes app
           (GET "/" [] "Hello")
           (GET "/catalog" [] (clojure.string/join "\n" (catalog/catalog)))
           (route/not-found "Not found"))
