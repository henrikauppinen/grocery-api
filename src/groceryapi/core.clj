(ns groceryapi.core)

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/json"}
   :body "{\"success\": true}"})
