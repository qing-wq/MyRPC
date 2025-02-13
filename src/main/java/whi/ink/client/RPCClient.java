package whi.ink.client;


import whi.ink.common.RPCRequest;
import whi.ink.common.RPCResponse;

public interface RPCClient {
    RPCResponse sendRequest(RPCRequest request);
}
