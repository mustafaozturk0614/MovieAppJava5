package com.bilgeadam.MovieAppJava5.mapper;

import com.bilgeadam.MovieAppJava5.dto.request.UserRegisterRequestDto;
import com.bilgeadam.MovieAppJava5.dto.response.UserRegisterResponseDto;
import com.bilgeadam.MovieAppJava5.repository.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IUserMapper {


    IUserMapper INSTANCE= Mappers.getMapper(IUserMapper.class);


    User  toUser(final UserRegisterRequestDto dto);

    UserRegisterResponseDto toUserRegisterResponseDto(final User user);


}
