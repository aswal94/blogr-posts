package com.qwetzal.blogr.blog.utils;

public class SlugUtility {
    public static String generateSlug(String str) {
        //          abc    abc    => abc-abc
        //   sd  sd  s  => sd-sd-s
        //   +,---, -
        //   lower case
        // uuidv16 ()   abc-abc-@23$23
        return str.toLowerCase()
                .replaceAll(" ", "-");
    }

    // TODO: Generate slug with uuid at last
}
