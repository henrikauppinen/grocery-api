(ns groceryapi.db
  (:require [clojure.java.jdbc :as sql]))

(def spec "postgresql://postgres:jepa@localhost:5432/postgres")

(defn catalog []
  (into [] (sql/query spec ["select * from catalog"])))
