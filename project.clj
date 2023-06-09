(defproject org.soulspace.clj/cmp.batik "0.2.1"
  :description "The cmp.batik library provides a Clojure wrapper for Apache Batik SVG components."
  :url "https://github.com/soulspace-org/cmp.batik"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}

  ; use deps.edn dependencies
  :plugins [[lein-tools-deps "0.4.5"]]
  :middleware [lein-tools-deps.plugin/resolve-dependencies-with-deps-edn]
  :lein-tools-deps/config {:config-files [:install :user :project]}
  
  :test-paths ["test"]
  :scm {:name "git" :url "https://github.com/soulspace-org/cmp.batik"}
  :deploy-repositories [["clojars" {:sign-releases false :url "https://clojars.org/repo"}]])
