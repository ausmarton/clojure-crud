(ns clojure-crud.core
  (:gen-class)
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [clojure.java.jdbc :as j]))
(def pg-db {:dbtype "postgresql"
            :dbname "postgres"
            :host "localhost"
            :port 36113
            :user "postgres"
            :password "mysecretpassword"
            :ssl false})

(defn handler [] (j/query pg-db
  ["select * from person"]
  {:row-fn str})
  )

(defroutes app
  (GET "/" [] (handler)) 
  (route/not-found "<h1>Page not found</h1>"))
