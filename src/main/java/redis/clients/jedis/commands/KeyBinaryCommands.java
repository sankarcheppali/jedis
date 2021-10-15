package redis.clients.jedis.commands;

import java.util.List;
import java.util.Set;
import redis.clients.jedis.params.RestoreParams;
import redis.clients.jedis.params.ScanParams;
import redis.clients.jedis.params.SortingParams;
import redis.clients.jedis.resps.ScanResult;

public interface KeyBinaryCommands {

  boolean exists(byte[] key);

  long exists(byte[]... keys);

  long persist(byte[] key);

  String type(byte[] key);

  byte[] dump(byte[] key);

  String restore(byte[] key, long ttl, byte[] serializedValue);

  String restore(byte[] key, long ttl, byte[] serializedValue, RestoreParams params);

  long expire(byte[] key, long seconds);

  long pexpire(byte[] key, long milliseconds);

  long expireAt(byte[] key, long unixTime);

  long pexpireAt(byte[] key, long millisecondsTimestamp);

  long ttl(byte[] key);

  long pttl(byte[] key);

  long touch(byte[] key);

  long touch(byte[]... keys);

  List<byte[]> sort(byte[] key);

  List<byte[]> sort(byte[] key, SortingParams sortingParameters);

  long del(byte[] key);

  long del(byte[]... keys);

  long unlink(byte[] key);

  long unlink(byte[]... keys);

  Long memoryUsage(byte[] key);

  Long memoryUsage(byte[] key, int samples);

  boolean copy(byte[] srcKey, byte[] dstKey, boolean replace);

  String rename(byte[] oldkey, byte[] newkey);

  long renamenx(byte[] oldkey, byte[] newkey);

  long sort(byte[] key, SortingParams sortingParameters, byte[] dstkey);

  long sort(byte[] key, byte[] dstkey);

  Set<byte[]> keys(byte[] pattern);

  ScanResult<byte[]> scan(byte[] cursor);

  ScanResult<byte[]> scan(byte[] cursor, ScanParams params);

  ScanResult<byte[]> scan(byte[] cursor, ScanParams params, byte[] type);

  byte[] randomBinaryKey();

}
