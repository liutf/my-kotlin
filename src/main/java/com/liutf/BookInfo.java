package com.liutf;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * FileName: BookInfo
 * Description:
 * Version: v1.0.0
 * Author: liutf
 * Date: 2017/5/21
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookInfo {
    private int id;
    private String name;
    private String author;

}
