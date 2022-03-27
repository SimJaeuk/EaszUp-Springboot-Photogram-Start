package com.cos.photogramstart.web.dto.comment;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import com.sun.istack.NotNull;

import lombok.Data;

// NotNull = Null값 체크
// NotEmpty = 빈값이거나 null체크
// NotBlank = 빈값, null, 공백 (스페이스) 체크


@Data
public class CommentDto {
	@NotBlank 
	private String content;
	@NotNull 
	private Integer imageId;
	
	// toEntity 가 필요 없다.
}
