package backjoon.bronze;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class test {
    public static void main(String[] args) throws Exception {
        String fileName = "test.txt";
        String copyFileName = "test2.txt";
        Path orgFilePath = Paths.get("/Users/devhee/copytest/"+fileName);
        Path copyFilePaht = Paths.get("/Users/devhee/copy/"+copyFileName);
        // 복사할 대상 폴더가 있는지 체크해서 없으면 생성
        if (!Files.exists(copyFilePaht.getParent())) {
            Files.createDirectories(copyFilePaht.getParent());
        }

        // StandardCopyOption.REPLACE_EXISTING : 파일이 이미 존재할 경우 덮어쓰기
        Files.copy(orgFilePath, copyFilePaht, StandardCopyOption.REPLACE_EXISTING);
    }
}
