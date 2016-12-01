package com.wsx.ones.core.ehcache;

import java.io.InputStream;

import org.springframework.core.io.ClassPathResource;

import com.wsx.ones.core.model.CoreCache;
import com.wsx.ones.finalstr.common.EhcacheStringUtil;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

/**
 * 抽象ehcache的方法
 * @author wangshuaixin
 *
 */
public abstract class BaseEhcacheManager {

	private static CacheManager cacheManager;
	
	
	private CacheManager getCacheManager() {
		if (null == cacheManager) {
			ClassPathResource pathResource = null;
			InputStream inputStream = null;
			try {
				//pathResource = new ClassPathResource("conf/ehcache.xml");
				pathResource = new ClassPathResource(getFileInfo());
				
				inputStream = pathResource.getInputStream();
				cacheManager = CacheManager.create(inputStream);
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				if (null != inputStream) {
					try {
						inputStream.close();
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
			}
		}
		return cacheManager;
	}
	
	public void setCoreCache(String key, CoreCache coreCache) {
		Element element = new Element(key, coreCache);
		if (!getCacheManager().cacheExists(EhcacheStringUtil.CORE_CACHE)) {
			getCacheManager().addCache(EhcacheStringUtil.CORE_CACHE);
		}
		getCacheManager().getCache(EhcacheStringUtil.CORE_CACHE).put(element);
	}
	
	public void removeCoreCache(String key) {
		getCacheManager().getCache(EhcacheStringUtil.CORE_CACHE).remove(key);
	}
	
	public CoreCache getCoreCache(String key) {
		Cache cache = getCoreCache();
		String cacheKey = key;
		Element element = cache.get(cacheKey);
		if (null != element) {
			return (CoreCache) getCoreCache().get(key).getValue();
		}
			
		return null;
	}

	private Cache getCoreCache() {
		return getCacheManager().getCache(EhcacheStringUtil.CORE_CACHE);
	}
	
	/**
	 * 子类实现，需要制定各个项目的配置文件路径
	 * @return
	 */
	public abstract String getFileInfo();
}
