# data.xml-205-issue

Reproduction

```bash
❯ clj -X:repo
{:tag :bar,
 :attrs {:xmlns "https://sts.amazonaws.com/doc/2011-06-15/"},
 :content ({:tag :foo, :attrs {}, :content ("hello, world")})}❯

clj -A:with-aalto -X:repo
{:tag :xmlns.https%3A%2F%2Fsts.amazonaws.com%2Fdoc%2F2011-06-15%2F/bar,
 :attrs {},
 :content
 ({:tag
   :xmlns.https%3A%2F%2Fsts.amazonaws.com%2Fdoc%2F2011-06-15%2F/foo,
   :attrs {},
   :content ("hello, world")})}
```
