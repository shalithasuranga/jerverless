/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jerverless.core.runner;

import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;

/**
 *
 * @author shalithasuranga
 */
public interface IFunctionRunner {
    public FunctionRunnerResponse exec(HttpExchange he) throws IOException ;
}
