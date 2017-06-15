(ns groceryapi.db
  (:require [clojure.java.jdbc :as sql] [environ.core :refer [env]]))

(def database-url (env :database-url))

(defn catalog []
  (into [] (sql/query database-url ["select * from catalog"])))
