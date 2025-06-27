package com.example.monster_csv_generator.controller;
import com.example.monster_csv_generator.parser.MonsterImportService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;

@RestController
@RequestMapping("/api/import")

public class controller {
    private final MonsterImportService importService;

    public controller(MonsterImportService importService){
        this.importService = importService;
    }

    @PostMapping("/folder")
    public ResponseEntity<String> importFromFolder(@RequestParam String path) {
        try {
            importService.importFromFolder(Path.of(path));
            return ResponseEntity.ok("Monster data imported successfully.");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Import failed: " + e.getMessage());
        }
    }

}
