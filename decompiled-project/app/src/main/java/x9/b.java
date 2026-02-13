package x9;

import com.kt.apps.media.xemtv.beta.R;
import java.util.HashMap;
import y.S;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f26277a;

    static {
        HashMap hashMap = new HashMap(7);
        f26277a = hashMap;
        S.c(R.layout.default_grid_fragment, hashMap, "layout/default_grid_fragment_0", R.layout.item_link_stream, "layout/item_link_stream_0");
        S.c(R.layout.layout_tv_channel_number, hashMap, "layout/layout_tv_channel_number_0", R.layout.layout_tv_program_schedule, "layout/layout_tv_program_schedule_0");
        S.c(R.layout.layout_video_codec_info, hashMap, "layout/layout_video_codec_info_0", R.layout.lb_program_row_header, "layout/lb_program_row_header_0");
        hashMap.put("layout/playback_vertical_grid_overlay_0", Integer.valueOf(R.layout.playback_vertical_grid_overlay));
    }
}
