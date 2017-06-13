(defproject groceryapi "0.1.0-SNAPSHOT"
  :description "Grocery api"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring/ring-core "1.6.1"]
                 [ring/ring-jetty-adapter "1.6.1"]
                 [org.clojure/java.jdbc "0.6.1"]
                 [org.postgresql/postgresql "9.4-1206-jdbc42"]]
  :plugins [[lein-ring "0.12.0"]]
  :ring {:handler groceryapi.core/handler})
