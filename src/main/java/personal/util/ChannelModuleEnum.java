package personal.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * 学习一下枚举类
 * @author xuguohui
 *
 */
public enum ChannelModuleEnum {
	CORPORATION(5,"corporation","企业","/Corporation",1),
	SINGLE(17,"single","单页面","",1),
	PLUGIN(100,"plugin","自定义插件","",1);
	
	private Integer value;
	private String  singleName;
	private String  singleTitle;
	private String channelUrl;
	private Integer depth;
	
	private ChannelModuleEnum(Integer value,String singleName,String singleTitle,String url,Integer depth) {
		this.singleName = singleName;
		this.singleTitle =  singleTitle;
		this.channelUrl = url;
		this.value = value;
		this.depth = depth;
	}
	public Integer getValue() {
		return value;
	}
	public String getSingleTitle() {
		return singleTitle;
	}
	public String getChannelUrl() {
		return channelUrl;
	}
	public String getSingleName() {
		return singleName;
	}

	public Integer getDepth() {
		return depth;
	} 
	
	
	public static Integer getDepth(Integer value){
		for(ChannelModuleEnum entity : ChannelModuleEnum.values()){
			if(value == entity.getValue()){
				return entity.getDepth();
			}
		}
		return 1;
	}
	
	public static String getTitle(Integer value){
		for (ChannelModuleEnum entity : ChannelModuleEnum.values()) {
			if(value == entity.getValue()){
				return entity.getSingleTitle();
			}
		}
		return null;
	}
	
	public static Map<String,Integer> channelModuleMap = null;
	
	public static List<Map<String,String>> channelList = new ArrayList<Map<String,String>>();
	
	public static List<Map<String,String>> getChannelList(){
		
		if(channelList.size()<1){
			Map<String,String> map = null;
			for(ChannelModuleEnum channel : ChannelModuleEnum.values()){
				if(channel.getValue()==ChannelModuleEnum.SINGLE.getValue()){
					continue;
				}
				 map = new HashMap<String, String>();
				 map.put("title", channel.getSingleTitle());
				 map.put("channelAlias", channel.getSingleName());
				 map.put("single", channel.getValue().toString());
				 map.put("group", channel.getValue().toString());
				 map.put("depth", channel.getDepth().toString());
				 channelList.add(map);
			}
		}
		
		return channelList;
	}
	
	public static Integer getSingleSign(String modelAlias){
		if(channelModuleMap==null){
			channelModuleMap = new HashMap<String, Integer>();
			channelModuleMap.put(CORPORATION.singleName, CORPORATION.value);
			channelModuleMap.put(SINGLE.singleName, SINGLE.value);
		}
		return channelModuleMap.get(modelAlias);
	}
	
}
