package redis.clients.jedis.commands;

import java.util.List;
import java.util.Set;

import redis.clients.jedis.params.RestoreParams;
import redis.clients.jedis.params.ScanParams;
import redis.clients.jedis.params.SortingParams;
import redis.clients.jedis.resps.ScanResult;

public interface KeyCommands {

  boolean exists(String key);

  long exists(String... keys);

  long persist(String key);

  String type(String key);

  byte[] dump(String key);

  String restore(String key, long ttl, byte[] serializedValue);

  String restore(String key, long ttl, byte[] serializedValue, RestoreParams params);

  long expire(String key, long seconds);

  long pexpire(String key, long milliseconds);

  long expireAt(String key, long unixTime);

  long pexpireAt(String key, long millisecondsTimestamp);

  long ttl(String key);

  long pttl(String key);

  long touch(String key);

  long touch(String... keys);

  List<String> sort(String key);

  long sort(String key, String dstkey);

  List<String> sort(String key, SortingParams sortingParameters);

  long sort(String key, SortingParams sortingParameters, String dstkey);

  long del(String key);

  long del(String... keys);

  long unlink(String key);

  long unlink(String... keys);

  Long memoryUsage(String key);

  Long memoryUsage(String key, int samples);

  boolean copy(String srcKey, String dstKey, boolean replace);

  Set<String> keys(String pattern);

  String rename(String oldkey, String newkey);

  long renamenx(String oldkey, String newkey);

  ScanResult<String> scan(String cursor);

  ScanResult<String> scan(String cursor, ScanParams params);

  ScanResult<String> scan(String cursor, ScanParams params, String type);

  String randomKey();

}
