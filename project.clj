(defproject groceryapi "0.1.0-SNAPSHOT"
  :description "Grocery api"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [environ "1.1.0"]
                 [migratus "0.9.5"]
                 [org.clojure/java.jdbc "0.6.1"]
                 [org.postgresql/postgresql "9.4-1206-jdbc42"]
                 [ring/ring-core "1.6.1"]
                 [ring/ring-jetty-adapter "1.6.1"]
                 [compojure "1.6.0"]]
  :plugins [[lein-ring "0.12.0"]
            [lein-environ "1.1.0"]
            [migratus-lein "0.4.9"]
            [lein-pprint "1.1.2"]]
  :ring {:handler groceryapi.core/app}
  :migratus {:store :database
             :migration-dir "migrations"})
