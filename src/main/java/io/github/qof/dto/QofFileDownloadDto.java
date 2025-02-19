package io.github.qof.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 文件下载信息
 *
 * @author yunze
 * @since 2025-02-16 15:43:42
 */
@Data
public class QofFileDownloadDto implements Serializable {

    private static final long serialVesionUID = 1L;

    /**
     * 文件唯一Id
     */
    @NotNull(message = "文件id不能为空")
    private Long fileId;

    /**
     * 文件存储模式(local、cos、oss)
     * <br>
     * 对应{@link io.github.qof.enums.QofStorageModeEnum}
     */
    @NotNull(message = "文件存储模式不能为空")
    private String fileStorageMode;

    /**
     * 文件存储桶
     */
    private String fileStorageBucket;
}

