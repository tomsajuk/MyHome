package com.myhome.controllers.dto.mapper;

import com.myhome.controllers.dto.HouseMemberDto;
import com.myhome.controllers.response.ListHouseMembersResponse;
import com.myhome.domain.HouseMember;
import java.util.Set;
import org.mapstruct.Mapper;

@Mapper
public interface HouseMemberMapper {
  Set<ListHouseMembersResponse.HouseMember> houseMemberSetToRestApiResponseHouseMemberSet(
      Set<HouseMember> houseMemberSet);

  HouseMember houseMemberDtoToHouseMember(HouseMemberDto houseMemberDto);
}