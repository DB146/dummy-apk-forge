package b3;

import android.net.Uri;
import android.provider.BaseColumns;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class h implements BaseColumns {

    /* renamed from: a, reason: collision with root package name */
    public static final Uri f13826a = Uri.parse("content://android.media.tv/channel");

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("VIDEO_FORMAT_480I", "VIDEO_RESOLUTION_SD");
        hashMap.put("VIDEO_FORMAT_480P", "VIDEO_RESOLUTION_ED");
        hashMap.put("VIDEO_FORMAT_576I", "VIDEO_RESOLUTION_SD");
        hashMap.put("VIDEO_FORMAT_576P", "VIDEO_RESOLUTION_ED");
        hashMap.put("VIDEO_FORMAT_720P", "VIDEO_RESOLUTION_HD");
        hashMap.put("VIDEO_FORMAT_1080I", "VIDEO_RESOLUTION_HD");
        hashMap.put("VIDEO_FORMAT_1080P", "VIDEO_RESOLUTION_FHD");
        hashMap.put("VIDEO_FORMAT_2160P", "VIDEO_RESOLUTION_UHD");
        hashMap.put("VIDEO_FORMAT_4320P", "VIDEO_RESOLUTION_UHD");
    }
}
