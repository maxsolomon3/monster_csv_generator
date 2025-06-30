package com.example.monster_csv_generator.controller;
import com.example.monster_csv_generator.parser.MonsterExportService;
import com.example.monster_csv_generator.parser.MonsterImportService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;

@RestController
@RequestMapping("/api")
public class controller {
    private final MonsterImportService importService;
    private final MonsterExportService exportService;

    public controller(MonsterImportService importService, MonsterExportService exportService){
        this.importService = importService;
        this.exportService = exportService;
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
    @GetMapping("/export/csv")
    public ResponseEntity<String> exportToCsv(@RequestParam String path) {
        try {
            exportService.exportToCSV(path);
            return ResponseEntity.ok("CSV export successful to: " + path);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Export failed: " + e.getMessage());
        }
    }

}
