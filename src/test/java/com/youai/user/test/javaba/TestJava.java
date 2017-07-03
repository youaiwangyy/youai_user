package com.youai.user.test.javaba;

import com.wangyy.youai.http.ActionStatus;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qingjiang on 2017/6/16.
 */
public class TestJava {


    /*private List<WnlLifeCardItemBean> fetch(String url, boolean upStatus, DspMold dspMold, TagsType... tagsType) {
        List<WnlLifeCardItemBean> resultList = new ArrayList<>();
        try {
            String result = httpClientUtil.getData(url);
            if (result != null && StringUtils.isNotBlank(result)) {
                JSONObject jsonObject = new JSONObject(result);
                String code = jsonObject.getString("code");
                if ("10000".equals(code)) {
                    JSONArray dataArray = jsonObject.getJSONArray("data");
                    for (int i = 0; i < dataArray.length(); i++) {
                        JSONObject obj = dataArray.getJSONObject(i);
                        String id = obj.getString("messageId");
                        String originalId = "wuli" + id;
                        String title = obj.getString("title");
                        if (!fetchFilterCacher.exits(0, originalId, title)) {
                            JSONArray picsTmp = new JSONArray();
                            String link = obj.getString("shareLink");
                            String thumbnailPic = "";
                            JSONArray pics = obj.getJSONArray("imageDTOList");
                            if (pics != null && pics.length() > 0) {
                                for (int m = 0; m < pics.length(); m++) {
                                    // 只取三张图
                                    if (m >= 3) {
                                        break;
                                    }
                                    JSONObject pic = pics.getJSONObject(m);
                                    int width = pic.getInt("width");
                                    int height = pic.getInt("height");
                                    String imageUrl = pic.getString("src");
                                    String imageUrlTmp = ImageHandleUtils.uploadYpyun(imageUrl.replaceAll("https", "http"), imagePath(imageUrl));
                                    if (StringUtils.isNotBlank(imageUrlTmp)) {
                                        boolean isAdd = true;
                                        if (height > 0 && height < 100) {
                                            isAdd = false;
                                        }
                                        if (width > 0 && width < 100) {
                                            isAdd = false;
                                        }
                                        if (isAdd) {
                                            picsTmp.put(imageUrlTmp);
                                        }
                                    }
                                }
                                if (picsTmp.length() > 0) {
                                    thumbnailPic = picsTmp.getString(0);
                                }
                            }
                            if (StringUtils.isNotBlank(thumbnailPic)) {//无图数据舍弃
                                long postId = this.syncPostServer(title, PostForumType.WULI.name(), "", "ext_url", link, thumbnailPic, "");
                                if (postId > 0) {
                                    DspLayoutType type = DspLayoutType.SMALL;
                                    if (picsTmp.length() >= 3) {
                                        type = DspLayoutType.MULTI;
                                    }
                                    resultList.add(this.buildWnlLifeCardItemBean(upStatus ? 1 : 0, originalId, title, picsTmp, "", postId,
                                            dspMold, DspThirdSource.WULI, type, SuishenDateUtil.getTodayStart(),
                                            SuishenDateUtil.getTodayEnd(), null, null, tagsType));
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            SLogger.error(e, e);
        }

        return resultList;
    }*/

    @Test
    public void test() {
        ActionStatus actionStatus = ActionStatus.PARAMAS_ERROR;
        String s = actionStatus.toJson();
        System.out.println(s);
    }

    @Test
    public void testSubList() {
        List<String> originalList = new ArrayList<String>();

        for(int i = 0; i < 5; i++){
            originalList.add(String.valueOf(i));
        }

        List<String> subList = originalList.subList(2, 4);
        for(String s : subList){
            System.out.println(s);
            //输出: 2, 3
        }
        System.out.println("-----");

        //非结构性的修改子列表subList，将会影响到原列表originalList 一同修改
        subList.set(0, "22");
        for(String s : originalList){
            System.out.println(s);
            //输出: 0, 1, 22, 3, 4
        }
        System.out.println("-----");

        //structural modification by sublist, reflect parentList
        subList.add(String.valueOf(2.5));
        for(String s : originalList){
            System.out.println(s);
            //output:0, 1, 22, ,3, 2.5,    4
        }
        System.out.println("-----");

        //non-structural modification by parentList, reflect sublist
        originalList.set(3, "33");
        for(String s : subList){
            System.out.println(s);
            //output: 22, 33, 2.5
        }
        System.out.println("-----");

        //structural modification by parentList, sublist becomes undefined(throw exception)
        originalList.add("6");
//        for(String s : subList){
//            System.out.println(s);
//        }
        subList.get(0);
    }
}
