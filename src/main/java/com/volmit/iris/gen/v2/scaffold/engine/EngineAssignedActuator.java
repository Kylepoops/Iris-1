package com.volmit.iris.gen.v2.scaffold.engine;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public abstract class EngineAssignedActuator<T> implements EngineActuator<T>
{
    @Getter
    private final Engine engine;
}
