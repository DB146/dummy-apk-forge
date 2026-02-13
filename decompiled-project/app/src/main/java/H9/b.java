package H9;

import gb.i;
import java.util.Map;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public abstract class b {
    private Object cacheData;
    private final a transformer = new Object();

    public final i error(String message) {
        l.e(message, "message");
        return i.i(new Throwable(message));
    }

    public final i execute(Map<String, ? extends Object> params) {
        l.e(params, "params");
        return prepareExecute(params).f(this.transformer);
    }

    public final Object getCacheData() {
        return this.cacheData;
    }

    public final a getTransformer() {
        return this.transformer;
    }

    public abstract i prepareExecute(Map map);

    public final void setCacheData(Object obj) {
        this.cacheData = obj;
    }
}
