package com.hzq.express.service.impl;

import com.hzq.express.dao.ScoreMapper;
import com.hzq.express.model.Score;
import com.hzq.express.service.ScoreService;
import com.hzq.express.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by hzqi on 2020/04/20.
 */
@Service
@Transactional
public class ScoreServiceImpl extends AbstractService<Score> implements ScoreService {
    @Resource
    private ScoreMapper scoreMapper;

}
