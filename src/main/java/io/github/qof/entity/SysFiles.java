package io.github.qof.entity;

import cn.hutool.core.date.DatePattern;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 系统-文件表(SysFiles)表实体类
 *
 * @author yunze
 * @since 2025-02-16 15:43:41
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SysFiles extends Model<SysFiles> {

    /**
     * 主键标识
     */
    private Long id;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = DatePattern.NORM_DATETIME_PATTERN)
    @DateTimeFormat(pattern = DatePattern.NORM_DATETIME_PATTERN)
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @JsonFormat(pattern = DatePattern.NORM_DATETIME_PATTERN)
    @DateTimeFormat(pattern = DatePattern.NORM_DATETIME_PATTERN)
    private LocalDateTime updateTime;

    /**
     * 数据是否有效：0数据有效
     */
    @TableLogic(value = "0", delval = "current_timestamp")
    private Long invalid;

    /**
     * 文件名称
     */
    private String fileName;

    /**
     * 文件路径
     */
    private String filePath;

    /**
     * 文件类型(image/png、image/jpeg)
     */
    private String fileType;

    /**
     * 文件标签（如：证件照、报告、审核表、图标等标识）
     */
    private String fileLabel;

    /**
     * 文件大小(单位byte字节)
     */
    private Long fileSize;

    /**
     * 文件存储模式(local、cos、oss)
     * <br>
     * 对应{@link io.github.qof.enums.QofStorageModeEnum}
     */
    private String fileStorageMode;

    /**
     * 文件存储桶
     */
    private String fileStorageBucket;

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    public Serializable pkVal() {
        return this.id;
    }
}

