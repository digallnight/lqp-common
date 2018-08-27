package com.lqp.common.base.tools;

import java.io.File;

public class FilesTools {
    /**
     * 批量修改文件名
     */
    public static void modifyFileName(String dir){
        // 先遍历整个文件夹
        // String dir = "D:\\Download\\Music";
        File f = new File(dir);
        if (!f.exists()) {
            System.out.println("文件夹为空！");
            System.exit(1);
        }
        File[] fs = f.listFiles();
        for (int i = 0; i < fs.length; i++) {
            String fileName = fs[i].getName();

            // 删除重复文件
            String str = fileName.substring(fileName.length() - 5, fileName.length() - 4);
            if ("2".equals(str) || "3".equals(str) || "4".equals(str) || "5".equals(str)) {
                System.out.println("正在删除" + fileName);
                fs[i].delete();
            }

            // 修改文件名
            int index = fileName.indexOf("——");
            if (index >= 0) {
                String fileName0 = fileName.substring(0, index)
                        + fileName.substring(fileName.length() - 4, fileName.length());
                boolean flag = false;
                for (int j = 0; j < fs.length; j++) {
                    if (fileName0.equals(fs[j].getName())) {
                        flag = true;
                        break;
                    }
                }
                // 防止同名
                if (flag) {
                    fs[i].delete();
                    System.out.println("同名文件已存在！删除文件" + fileName);
                } else {
                    fs[i].renameTo(new File(dir + "\\" + fileName0));
                    System.out.println(fileName + "==>" + fileName0);
                }
            }
        }
    }
}
