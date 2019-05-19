(defproject secretstream "master-SNAPSHOT"
  :description "implementation of the crypto_secretstream_xchacha20poly1305 API using current caesium primitives."
  :license {:name "ISC"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [caesium "0.12.0"]]
  :main ^:skip-aot secretstream.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
