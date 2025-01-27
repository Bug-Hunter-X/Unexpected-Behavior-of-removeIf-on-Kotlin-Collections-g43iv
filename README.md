# Unexpected Behavior of removeIf on Kotlin Collections

This example demonstrates a subtle, but potentially problematic, behavior of the `removeIf` function when used with mutable collections in Kotlin.  While seemingly straightforward, modifying a collection during iteration with `removeIf` can lead to unexpected results, such as skipping elements.

The provided code showcases this issue with `MutableList`, `MutableMap`, and `MutableSet`.  The solution suggests safer alternatives for removing elements from collections while iterating.
