package com.webdev.awsS3.controllers;

import com.webdev.awsS3.services.FileService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/files")
public class FileController {

    private final FileService fileService;

    public FileController(FileService fileService) {
        this.fileService = fileService;
    }

    @GetMapping("/list")
    public List<String> listFiles(
            @RequestParam String bucket,
            @RequestParam String folder
    ) {
        return fileService.listFilesInFolder(bucket,folder);
    }
}

